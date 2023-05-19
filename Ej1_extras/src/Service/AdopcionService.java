package Service;

import Entidades.Perro;
import Entidades.Persona;
import Enumeraciones.RazaPerro;
import Enumeraciones.TamanoAnimal;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AdopcionService {

    private final Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private final Random rand = new Random();

    public Persona crearPersona() {
        return new Persona();
    }

    public ArrayList<Persona> fabricaPersonas() {
        ArrayList<Persona> personas = new ArrayList<>();
        System.out.println("Ingrese cantidad de personas a crear");
        int cantPersonas = input.nextInt();

        for (int i = 0; i < cantPersonas; i++) {

            String nombre = "Especimen ";
            String apellido = "#" + (i + 1);
            int edad = rand.nextInt(90)+18;
            long dni = rand.nextInt(generadorDNI());
            personas.add(new Persona(nombre, apellido, edad, dni));
        }
        return personas;
    }

    public int generadorDNI() {
        int digitosDeseados = 8;
        int rangoMinimo = (int) Math.pow(10, digitosDeseados - 1);
        int rangoMaximo = (int) Math.pow(10, digitosDeseados) - 1;
        Random random = new Random();
        int numeroAleatorio = random.nextInt(rangoMaximo - rangoMinimo + 1) + rangoMinimo;
        return numeroAleatorio;
    }
    
    public ArrayList<Perro> fabricaPerros() {
        ArrayList<Perro> perros = new ArrayList<>();
        System.out.println("Ingrese cantidad de perros a crear");
        int cantPersonas = input.nextInt();

        for (int i = 0; i < cantPersonas; i++) {

            String nombre = "Perro ";
            String apellido = "#" + (i + 1);
            int tamano = rand.nextInt(3);
            int posRaza = rand.nextInt(10);
            int edad = rand.nextInt(20);
            long dni = rand.nextInt(generadorDNI());
            perros.add(new Perro(nombre, RazaPerro.values()[posRaza], edad,TamanoAnimal.values()[tamano]));
        }
        return perros;
    }
    
    public <T> void mostrarLista(ArrayList<T> lista) {
        for (T elemento : lista) {
            System.out.println(elemento);
        }
    }

    
    
}
