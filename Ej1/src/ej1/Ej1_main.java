package ej1;

import Entidades.Perro;
import Entidades.Persona;

public class Ej1_main {

    /**
     * Ahora deberemos en el main crear dos Personas y dos Perros. Después,
     * vamos a tener que pensar la lógica necesaria para asignarle a cada
     * Persona un Perro y por ultimo, mostrar desde la clase Persona, la
     * información del Perro y de la Persona.
     *
     * @param args
     */

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Perro perro1 = new Perro();
        Perro perro2 = new Perro();
        persona1.setMascota(perro2);
        persona2.setMascota(perro1);
        System.out.println(persona1);
        System.out.println(persona2);
        
    }

}
