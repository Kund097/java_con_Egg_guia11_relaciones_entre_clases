package Servicios;

import Entidades.Cliente;
import Entidades.Cuota;
import Entidades.Poliza;
import Entidades.Vehiculo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author facun
 */
public class GestionService {

    private final Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public Cliente crearCliente() {
        String nombre = "Facundo";
        String apellido = "Vallejos";
        long dni = 87654321;
        String mail = "facundo@gmail.com";
        String domicilio = "Av siempre viva 123";
        int telefono = 123456789;

        return new Cliente(nombre, apellido, dni, mail, domicilio, telefono);
    }

    public Vehiculo crearVehiculo() {
        String marca = "Audi";
        String modelo = "TT";
        int ano = 2017;
        String numeroMotor = "ABC123456DEF";
        String chasis = "1HGCM82633A123456";
        String color = "Gris Plata";
        String tipo = "Cupé";

        return new Vehiculo(marca, modelo, ano, numeroMotor, chasis, color, tipo);
    }

    public void asignarVehiculoCliente(Cliente cliente, Vehiculo vehiculo) {

        vehiculo.setPropietario(cliente);
        cliente.setVehiculo(vehiculo);

    }

    public void cargarVehiculo(ArrayList<Vehiculo> vehiculos, Vehiculo nuevoVehiculo) {

        vehiculos.add(nuevoVehiculo);

    }

    public void cargarCliente(ArrayList<Cliente> clientes, Cliente nuevoCliente) {
        clientes.add(nuevoCliente);
    }

    public boolean verificarClienteYVehiculoCreado(Vehiculo nuevoVehiculo, Cliente nuevoCliente) {

        return (nuevoVehiculo != null && nuevoCliente != null);
    }

    public Cuota crearCuota() {
        
        int numeroDeCuota = 1;
        int montoTotal = 125;
        boolean pago = true;
        String vencimiento = "10/10/23";
        String formaDePago = "Debito";
        return new Cuota(numeroDeCuota, montoTotal, pago, vencimiento, formaDePago);
    }
    
    public Poliza crearPoliza(Cliente nuevoCliente, Vehiculo nuevoVehiculo) {
        // pido datos para la poliza
        Poliza nuevaPoliza = new Poliza();
        nuevaPoliza.setCliente(nuevoCliente);
        nuevaPoliza.setVehiculo(nuevoVehiculo);
        nuevaPoliza.asignarCuota(crearCuota());
        return nuevaPoliza;
    }

    public void asignarNuevaCuota(ArrayList<Poliza> polizas) {
        System.out.println("Ingrese nombre cliente de la poliza a buscar");
        String nombre = input.next();
        
        for (Poliza poliza : polizas) {
            if (poliza.getCliente().getNombre().equalsIgnoreCase(nombre)) {
                poliza.asignarCuota(crearCuota());
                return;
            }
        }
        System.out.println("cliente no encontrado");
        
    }
    
    public void mostrarPolizas(ArrayList<Poliza>polizas) {
        
        for (Poliza poliza : polizas) {
            System.out.println(poliza);
        }
        
    }
    
    public void mostrarClientes(ArrayList<Cliente> clientes) {
        
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
        
    }
       
    
    
    
    
    public void menu() {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Poliza> polizas = new ArrayList<>();
        Vehiculo nuevoVehiculo = null;
        Cliente nuevoCliente = null;
        Poliza nuevaPoliza = null;
        final String OPCION_SALIR = "\n0-Terminar";
        final int SALIR = 0;
        int op;
        do {

            System.out.println("MENU"
                    + "\n1-Crear Cliente y Vehiculo"
                    + "\n2-Cargar vehiculo a la lista"
                    + "\n3-Cargar Cliente a la lista"
                    + "\n4-Cargar poliza"
                    + "\n5-Cargar nueva cuota"
                    + "\n6-Mostrar polizas"
                    + "\n7-Mostrar clientes"
                    +OPCION_SALIR);
            op = input.nextInt();
            switch (op) {
                case 1:
                    nuevoCliente = crearCliente();
                    nuevoVehiculo = crearVehiculo();
                    break;
                case 2:

                    if (verificarClienteYVehiculoCreado(nuevoVehiculo, nuevoCliente)) {
                        cargarVehiculo(vehiculos, nuevoVehiculo);
                    } else {
                        System.out.println("Ingrese la primer opcion primero");
                    }

                    break;
                case 3:
                    
                    if (verificarClienteYVehiculoCreado(nuevoVehiculo, nuevoCliente)) {
                        cargarCliente(clientes, nuevoCliente);
                    } else {
                        System.out.println("Ingrese la primer opcion primero");
                    }
                    
                    break;
                case 4:
                    nuevaPoliza = crearPoliza(nuevoCliente, nuevoVehiculo);
                    polizas.add(nuevaPoliza);
                    break;
                case 5:
                    asignarNuevaCuota(polizas);
                    break;
                case 6:
                    mostrarPolizas(polizas);
                    break;
                case 7:
                    mostrarClientes(clientes);
                    break;
                case SALIR:
                    
                    break;
                default:
                    System.out.println("Opcion invalida");
            }

        } while (op!=0);

    }
}
