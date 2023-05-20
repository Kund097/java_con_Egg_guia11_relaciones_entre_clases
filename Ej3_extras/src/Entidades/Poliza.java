package Entidades;

import java.util.ArrayList;

/**
 * Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos
 * tanto de un vehículo, como los datos de un solo cliente. Los datos incluidos
 * en ella son: número de póliza, fecha de inicio y fin de la póliza, cantidad
 * de cuotas, forma de pago, monto total asegurado, incluye granizo, monto
 * máximo granizo, tipo de cobertura (total, contra terceros, etc.). Nota:
 * prestar atención al principio de este enunciado y pensar en las relaciones
 * entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
 * muchos a uno o de muchos a muchos.
 *
 * @author facun
 */
public class Poliza {

    private Vehiculo vehiculo;
    private Cliente cliente;
    private String numeroPoliza;
    private int fechaInicio;
    private int finDeLaPoliza;
    private String formaDePago;
    private int montoTotalAsegurado;
    private boolean incluyeGranizo;
    private int montoMaximoGranizo;
    private String tipoDeCobertura;
    private ArrayList<Cuota> cantCuotas;
    
  // constructores
    public Poliza() {
        cantCuotas = new ArrayList<>();
    }

    public Poliza(Vehiculo vehiculo, Cliente cliente, String numeroPoliza, int fechaInicio, int finDeLaPoliza, String formaDePago, int montoTotalAsegurado, boolean incluyeGranizo, int montoMaximoGranizo, String tipoDeCobertura) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.numeroPoliza = numeroPoliza;
        this.fechaInicio = fechaInicio;
        this.finDeLaPoliza = finDeLaPoliza;
        this.formaDePago = formaDePago;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.incluyeGranizo = incluyeGranizo;
        this.montoMaximoGranizo = montoMaximoGranizo;
        this.tipoDeCobertura = tipoDeCobertura;
    }
    
    
 //getters
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getNumeroPoliza() {
        return numeroPoliza;
    }

    public int getFechaInicio() {
        return fechaInicio;
    }

    public int getFinDeLaPoliza() {
        return finDeLaPoliza;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public int getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public boolean isIncluyeGranizo() {
        return incluyeGranizo;
    }

    public int getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public String getTipoDeCobertura() {
        return tipoDeCobertura;
    }

    public ArrayList<Cuota> getCantCuotas() {
        return cantCuotas;
    }

 //setters

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setNumeroPoliza(String numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public void setFechaInicio(int fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFinDeLaPoliza(int finDeLaPoliza) {
        this.finDeLaPoliza = finDeLaPoliza;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public void setMontoTotalAsegurado(int montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public void setIncluyeGranizo(boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public void setMontoMaximoGranizo(int montoMaximoGranizo) {
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    public void setTipoDeCobertura(String tipoDeCobertura) {
        this.tipoDeCobertura = tipoDeCobertura;
    }

    public void setCantCuotas(ArrayList<Cuota> cantCuotas) {
        this.cantCuotas = cantCuotas;
    }
    
    public void asignarCuota(Cuota nuevaCuota) {
        cantCuotas.add(nuevaCuota);
    }

    @Override
    public String toString() {
        return "Poliza{" + "vehiculo=" + vehiculo + ", cliente=" + cliente + ", numeroPoliza=" + numeroPoliza + ", fechaInicio=" + fechaInicio + ", finDeLaPoliza=" + finDeLaPoliza + ", cantCuotas=" + cantCuotas + ", formaDePago=" + formaDePago + ", montoTotalAsegurado=" + montoTotalAsegurado + ", incluyeGranizo=" + incluyeGranizo + ", montoMaximoGranizo=" + montoMaximoGranizo + ", tipoDeCobertura=" + tipoDeCobertura + '}';
    }
    
}
