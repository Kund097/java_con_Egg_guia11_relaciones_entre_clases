package ej2_main;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import Servicios.JuegoService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author facun
 */
public class Ej2_main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        JuegoService juegoServ = new JuegoService();
        ArrayList<Jugador> jugadores = new ArrayList();
        String nombre;
        String id;
        int cantJugadores;
        System.out.println("Ingrese cantidad de jugadores (2-6)");
        cantJugadores = input.nextInt();

        if (cantJugadores >= 2 && cantJugadores <= 6) {
            for (int i = 0; i < cantJugadores; i++) {

                System.out.println("Ingrese nombre del jugador #" + (i + 1));
                nombre = input.next();
                id = String.valueOf(i + 1);
                jugadores.add(new Jugador(id, nombre));

            }
            Revolver r = new Revolver();
            Juego j = new Juego();
            juegoServ.llenarJuego(jugadores, r, j);
            juegoServ.ronda(jugadores, r);
        }
        

    }

}
