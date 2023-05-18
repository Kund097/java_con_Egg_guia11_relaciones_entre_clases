package Entidades;

import Enumeraciones.PosicionAsiento;

/**
 *
 * @author facun
 */
public class Asiento {

    private PosicionAsiento posicion;
    private Espectador espectador;

    public Asiento() {
    }

    public Asiento(PosicionAsiento posicion) {
        this.posicion = posicion;
    }

    public PosicionAsiento getPosicion() {
        return posicion;
    }

    public void setPosicion(PosicionAsiento posicion) {
        this.posicion = posicion;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    public boolean hayEspectador() {
        return this.espectador != null;
    }
}
