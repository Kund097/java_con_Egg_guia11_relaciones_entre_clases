package Entidades;

/**
 * Alumno con los siguientes atributos:
 *
 * nombre completo, DNI y cantidad de votos. Además, crearemos una clase
 * Simulador que va a tener los métodos para manejar los alumnos y sus
 * votaciones. Estos métodos serán llamados desde el main.
 *
 * @author facun
 */
public class Alumno {

    private String nombreCompleto;
    private String DNI;

    public Alumno() {
    }

    public Alumno(String nombreCompleto, String DNI) {
        this.nombreCompleto = nombreCompleto;
        this.DNI = DNI;
    }

    
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDNI() {
        return DNI;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Nombre completo: " + nombreCompleto + ", DNI:" + DNI + '}';
    }
    
       
}
