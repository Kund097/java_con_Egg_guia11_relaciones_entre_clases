package Entidades;

import Enumeraciones.RazaPerro;
import Enumeraciones.TamanoAnimal;

/**
 *
 * @author facun
 */
public class Perro {

    private String nombre;
    private RazaPerro raza;
    private int edad;
    private TamanoAnimal tamanio;
    private Persona dueño;

    public Perro() {
    }

    public Persona getDueño() {
        return dueño;
    }

    public void setDueño(Persona dueño) {
        this.dueño = dueño;
    }

    public Perro(String nombre, RazaPerro raza, int edad, TamanoAnimal tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public RazaPerro getRaza() {
        return raza;
    }

    public void setRaza(RazaPerro raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public TamanoAnimal getTamanio() {
        return tamanio;
    }

    public void setTamanio(TamanoAnimal tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        if (dueño != null) {
            return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamanio=" + tamanio + ", due\u00f1o=" + dueño + '}';
        } else {
            return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamanio=" + tamanio + ", No tiene dueño";
        }
    }

}
