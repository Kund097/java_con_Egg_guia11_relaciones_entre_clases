package Servicios;

import Entidades.Alumno;
import Enumeraciones.Apellido;
import Enumeraciones.Nombre;
import java.util.ArrayList;
import java.util.Random;

/**
 * • La clase Simulador debe tener un método que genere un listado de alumnos
 * manera aleatoria y lo retorne. Las combinaciones de nombre y apellido deben
 * ser generadas de manera aleatoria. Nota: usar listas de tipo String para
 * generar los nombres y los apellidos.
 *
 * @author facun
 */
public class Simulador {

    private final Random rand = new Random();

    public void listadoAlumnosAleatorio(ArrayList<Alumno> alumnos, int cantAlumnos) {
        
        for (int i = 0; i < cantAlumnos; i++) {
            Alumno nuevoAlumno = new Alumno();
            asignarNombreAleatorio(nuevoAlumno);
            asignarApellidoAleatorio(nuevoAlumno);
            alumnos.add(nuevoAlumno);

        }

    }

    public void asignarNombreAleatorio(Alumno alumnoActual) {
        String nombre = Nombre.values()[rand.nextInt(4)].toString();
        alumnoActual.setNombreCompleto(nombre);
    }

    public void asignarApellidoAleatorio(Alumno alumnoActual) {
        String apellido = Apellido.values()[rand.nextInt(4)].toString();
        alumnoActual.setNombreCompleto(alumnoActual.getNombreCompleto() + " " + apellido);
    }

    public void mostrarAlumnos(ArrayList<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
    
}
