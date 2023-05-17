package ej3;

import Servicios.CartaService;

/**
 * Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene
 * un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas,
 * bastos, oros y copas). Esta clase debe contener un método toString() que
 * retorne el número de carta y el palo. La baraja estará compuesta por un
 * conjunto de cartas, 40 exactamente.
 *
 * @author facun
 */
public class Ej3_main {

    public static void main(String[] args) {

        CartaService cs = new CartaService();
        cs.menu();
        
    }

}
