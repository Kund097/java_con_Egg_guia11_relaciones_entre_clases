package Entidades;

import Enumeraciones.Numero;
import Enumeraciones.Palo;

/**
 * Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un
 * palo (espadas, bastos, oros y copas). Esta clase debe contener un método
 * toString() que retorne el número de carta y el palo.
 *
 * @author facun
 */
public class Carta {

    private Numero numero;
    private Palo palo;

    public Carta() {
    }

    public Carta(Numero numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Numero getNumero() {
        return numero;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "numero=" + numero.getDescripcion() + ", palo=" + palo + "\n";
    }
    
}
