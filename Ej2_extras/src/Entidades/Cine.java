
package Entidades;

import java.util.ArrayList;



/**
 *
 * @author facun
 */
public class Cine {
    
    private ArrayList<ArrayList<Asiento>> sala;
    private Pelicula peliculaActual;
    private double precioEntrada;

    public Cine() {
    }

    public Cine(Pelicula peliculaActual, double precioEntrada) {
        this.peliculaActual = peliculaActual;
        this.precioEntrada = precioEntrada;
    }

    public Pelicula getPeliculaActual() {
        return peliculaActual;
    }

    public void setPeliculaActual(Pelicula peliculaActual) {
        this.peliculaActual = peliculaActual;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public ArrayList<ArrayList<Asiento>> getSala() {
        return sala;
    }

    public void setSala(ArrayList<ArrayList<Asiento>> sala) {
        this.sala = sala;
    }
    
}
