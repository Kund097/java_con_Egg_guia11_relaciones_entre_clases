package ej4_extras;

import Entidades.Alumno;
import Servicios.Simulador;
import java.util.ArrayList;

/**
 * 4. Desarrollar un simulador del sistema de votación de facilitadores en Egg-
 * El sistema de votación de Egg tiene una clase llamada Alumno con los
 * siguientes atributos:
 * nombre completo, DNI y cantidad de votos. Además, crearemos una clase
 * Simulador que va a tener los métodos para manejar los alumnos y sus
 * votaciones. Estos métodos serán llamados desde el main.
 *
 * @author facun
 */
public class Ej4_extras {

    public static void main(String[] args) {
        final int CANTIDAD_ALUMNOS = 10;
        ArrayList<Alumno> alumnos = new ArrayList<>();
        Simulador servicio = new Simulador();
        
        servicio.listadoAlumnosAleatorio(alumnos, CANTIDAD_ALUMNOS);
        servicio.mostrarAlumnos(alumnos);
    }

}
