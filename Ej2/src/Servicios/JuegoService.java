package Servicios;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author facun
 */
public class JuegoService {

    private final Random rand = new Random();

    /**
     * * Metodos Juego Métodos: • llenarJuego(ArrayList<Jugador>jugadores,
     * Revolver r): este método recibe los jugadores y el revolver para
     * guardarlos en los atributos del juego.
     *
     * @param jugadores
     * @param r
     * @param j
     */
    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r, Juego j) {
        j.setJugadores(jugadores);
        j.setRevolver(r);
    }

    /**
     * Metodo Juego • ronda(): cada ronda consiste en un jugador que se apunta
     * con el revolver de agua y aprieta el gatillo. Si el revolver tira el agua
     * el jugador se moja y se termina el juego, sino se moja, se pasa al
     * siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
     * mojar. Al final del juego, se debe mostrar que jugador se mojó. Pensar la
     * lógica necesaria para realizar esto, usando los atributos de la clase
     * Juego.
     *
     * @param jugadores
     * @param r
     */
    public void ronda(ArrayList<Jugador> jugadores, Revolver r) {
        llenarRevolver(r);
        int contador = 1;
        boolean jugadorMojado = false;
        /*
        for (Jugador jugador : jugadores) {
            System.out.println("Ronda #" + contador);
            contador++;
            System.out.println(toString(r));
            disparo(r, jugador);
            if (jugador.isMojado()) {
                System.out.println("el jugador mojado es: " + jugador.getNombre());
                break;
            }

        }
         */

        do {
            for (Jugador jugador : jugadores) {
                System.out.println("Ronda #" + contador);
                contador++;
                System.out.println(toString(r));
                disparo(r, jugador);
                if (jugador.isMojado()) {
                    System.out.println("el jugador mojado es: " + jugador.getNombre());
                    jugadorMojado = true;
                    break;
                }
            }
        } while (!jugadorMojado);

        /*
        for (int i = 0; i < 6; i++) {

            Jugador jugadorActual = jugadores.get(i);
            System.out.println("Ronda #" + (i + 1));
            System.out.println(toString(r));
            disparo(r, jugadorActual);
            if (jugadorActual.isMojado()) {
                System.out.println("el jugador mojado es: " + jugadorActual.getNombre());
                return;
            }
        }
         */
    }

    /**
     * Metodos revolver • llenarRevolver(): le pone los valores de posición
     * actual y de posición del agua. Los valores deben ser aleatorios. •
     * mojar(): devuelve true si la posición del agua coincide con la posición
     * actual • siguienteChorro(): cambia a la siguiente posición del tambor •
     * toString(): muestra información del revolver (posición actual y donde
     * está el agua)
     *
     * @param r
     */
    public void llenarRevolver(Revolver r) {

        r.setPosicionActual(rand.nextInt(6) + 1);
        r.setPosicionAgua(rand.nextInt(6) + 1);

    }

    public boolean mojar(Revolver r) {
        return (r.getPosicionActual() == r.getPosicionAgua());
    }

    public void siguienteChorro(Revolver r) {
        if (r.getPosicionActual() != 6) {
            r.setPosicionActual(r.getPosicionActual() + 1);
        } else {
            r.setPosicionActual(1);
        }
    }

    public String toString(Revolver r) {
        return "Posicion actual: " + r.getPosicionActual() + ""
                + "\nPosicion del agua: " + r.getPosicionAgua();

    }

    /**
     * Metodo/s Jugador
     *
     * disparo(Revolver r): el método, recibe el revolver de agua y llama a los
     * métodos de mojar() y siguienteChorro() de Revolver. El jugador se apunta,
     * aprieta el gatillo y si el revolver tira el agua, el jugador se moja. El
     * atributo mojado pasa a false y el método devuelve true, sino false.
     *
     * @param r
     * @param j
     */
    public void disparo(Revolver r, Jugador j) {
        if (mojar(r)) {
            j.setMojado(true);
        } else {
            j.setMojado(false);
        }
        siguienteChorro(r);
    }

}
