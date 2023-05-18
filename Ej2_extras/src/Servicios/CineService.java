package Servicios;

import Entidades.Asiento;
import Entidades.Cine;
import Entidades.Espectador;
import Entidades.Pelicula;
import Enumeraciones.PosicionAsiento;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author facun
 */
public class CineService {

    Random rand = new Random();

    public Cine crearCine() {
        Pelicula peli = new Pelicula("La La Land", "Damien Chazelle", 128, 13);
        double precioEntrada = 10.00;
        return new Cine(peli, precioEntrada);
    }

    public void cargarSala(Cine cine) {
        int pos = 0;
        ArrayList<ArrayList<Asiento>> sala = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            ArrayList<Asiento> fila = new ArrayList<>();
            for (int j = 0; j < 6; j++) {
                fila.add(new Asiento(PosicionAsiento.values()[pos]));
                pos++;
            }
            sala.add(fila);
        }
        cine.setSala(sala);
    }

    public void mostrarSala(Cine cine) {

        for (ArrayList<Asiento> fila : cine.getSala()) {
            for (Asiento asiento : fila) {

                if (asiento.hayEspectador()) {
                    System.out.print("[" + asiento.getPosicion() + " X]");
                } else {
                    System.out.print("[" + asiento.getPosicion() + "  ]");
                }
            }
            System.out.println("");
        }
    }

    public void cargarEspectadores(Cine cine) {
        int edad;
        int dinero;
        Espectador espectador;
        for (ArrayList<Asiento> fila : cine.getSala()) {
            for (Asiento asiento : fila) {
                edad = rand.nextInt(80);
                dinero = rand.nextInt(100);
                espectador = new Espectador("Espe", edad, dinero);
                if (verificarRequisitos(cine, espectador, asiento)) {

                    asiento.setEspectador(espectador);

                }
            }
        }
    }

    public boolean verificarRequisitos(Cine cine, Espectador espe, Asiento asiento) {
        Pelicula peliActual = cine.getPeliculaActual();
        if (!asiento.hayEspectador()) {

            if (espe.getEdad() >= peliActual.getEdadMinima() && espe.getDinero() >= cine.getPrecioEntrada()) {
                espe.setDinero(espe.getDinero()-cine.getPrecioEntrada());
                return true;
            }

        }
        return false;
    }

    public void datosCine(Cine cine) {
        System.out.println("Efectivamente es cine");
        System.out.println(cine.getPeliculaActual() + ""
                + "\nPrecio entrada; " + cine.getPrecioEntrada());
        System.out.println("-----ESPECTADORES-----");
        for (ArrayList<Asiento> fila : cine.getSala()) {
            for (Asiento asiento : fila) {
                if (asiento.hayEspectador()) {
                    System.out.print("[" + asiento.getEspectador() + "Asiento:" + asiento.getPosicion() + "]");
                }
            }
            System.out.println("");
        }

    }

}
