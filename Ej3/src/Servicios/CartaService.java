package Servicios;

import Entidades.Carta;
import Enumeraciones.Numero;
import Enumeraciones.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 * • barajar(): cambia de posición todas las cartas aleatoriamente. •
 * siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando
 * no haya más o se haya llegado al final, se indica al usuario que no hay más
 * cartas. • cartasDisponibles(): indica el número de cartas que aún se puede
 * repartir. • darCartas(): dado un número de cartas que nos pidan, le
 * devolveremos ese número de cartas. En caso de que haya menos cartas que las
 * pedidas, no devolveremos nada, pero debemos indicárselo al usuario. •
 * cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido
 * ninguna indicárselo al usuario • mostrarBaraja(): muestra todas las cartas
 * hasta el final. Es decir, si se saca una carta y luego se llama al método,
 * este no mostrara esa primera carta.
 *
 * @author facun
 */
public class CartaService {

    private final Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    /**
     * • barajar(): cambia de posición todas las cartas aleatoriamente.
     *
     * @param mazo
     */
    public void barajar(ArrayList<Carta> mazo) {

        Collections.shuffle(mazo);

    }

    /**
     * • siguienteCarta(): devuelve la siguiente carta que está en la baraja,
     * cuando no haya más o se haya llegado al final, se indica al usuario que
     * no hay más cartas.
     *
     * @param mazo
     * @param monton
     * @return
     */
    public Carta siguienteCarta(ArrayList<Carta> mazo, ArrayList<Carta> monton) {
        if (mazo.isEmpty()) {
            System.out.println("No hay mas cartas");
            return null;
        }
        monton.add(mazo.get(0));
        mazo.remove(0);
        return monton.get(0);
    }

    /**
     * • cartasDisponibles(): indica el número de cartas que aún se puede
     * repartir.
     *
     * @param mazo
     */
    public void cartasDisponibles(ArrayList<Carta> mazo) {
        System.out.println("Cartas disponibles: " + mazo.size());
    }

    /**
     * • darCartas(): dado un número de cartas que nos pidan, le devolveremos
     * ese número de cartas. En caso de que haya menos cartas que las pedidas,
     * no devolveremos nada, pero debemos indicárselo al usuario.
     *
     * @param mazo
     * @param monton
     * @return
     */
    public ArrayList<Carta> darCartas(ArrayList<Carta> mazo, ArrayList<Carta> monton) {
        ArrayList<Carta> cartasADar = new ArrayList<>();
        System.out.println("cuantas cartas queres?");
        int cantCartas = input.nextInt();
        if (cantCartas < mazo.size()) {
            cartasADar.addAll(mazo.subList(0, cantCartas));
            monton.addAll(mazo.subList(0, cantCartas));
            mazo.removeAll(mazo.subList(0, cantCartas));
        } else {
            System.out.println("No hay cartas suficientes");
            cartasADar = null;
        }

        return cartasADar;
    }

    /**
     * • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha
     * salido ninguna indicárselo al usuario
     *
     * @param monton
     */
    public void cartasMonton(ArrayList<Carta> monton) {
        if (monton.isEmpty()) {
            System.out.println("No ha salido ninguna carta");
        } else {
            System.out.println("Cartas que salieron: " + monton.toString());
        }
    }

    /**
     * • mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si
     * se saca una carta y luego se llama al método, este no mostrara esa
     * primera carta.
     *
     * @param mazo
     */
    public void mostrarBaraja(ArrayList<Carta> mazo) {
        System.out.println("Baraja: " + mazo.toString());
    }

    public ArrayList<Carta> cargarMazo() {
        ArrayList<Carta> mazo = new ArrayList<>();
        //ArrayList<Carta> monton = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 40; i++) {
            Carta carta = new Carta();
            carta.setNumero(Numero.values()[rand.nextInt(10)]);
            carta.setPalo(Palo.values()[rand.nextInt(4)]);
            mazo.add(carta);
        }

        return mazo;
    }

    /**
     * menu
     */
    public void menu() {
        ArrayList<Carta> mazo = cargarMazo();
        ArrayList<Carta> monton = new ArrayList<>();
        int op;
        do {
            System.out.println("-----MENU-----\n"
                    + "\n1-Barajar"
                    + "\n2-Dar Cartas"
                    + "\n3-Siguiente carta"
                    + "\n4-Cartas del monton"
                    + "\n5-Mostrar baraja"
                    + "\n0-Para salir");
            op = input.nextInt();
            switch (op) {
                case 1:
                    barajar(mazo);
                    break;
                case 2:
                    darCartas(mazo, monton);
                    break;
                case 3:
                    siguienteCarta(mazo, monton);
                    break;
                case 4:
                    cartasMonton(monton);
                    break;
                case 5:
                    mostrarBaraja(mazo);
                    break;
                case 0:
                    System.out.println("Chau");
                    break;
                default:
                    System.out.println("opcion incorrecta");
            }
        } while (op != 0);

    }
}
