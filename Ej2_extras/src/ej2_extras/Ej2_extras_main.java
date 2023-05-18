package ej2_extras;

import Entidades.Cine;
import Servicios.CineService;



public class Ej2_extras_main {

    public static void main(String[] args) {

        CineService cs = new CineService();
        Cine cine = cs.crearCine();
        cs.cargarSala(cine);
        cs.mostrarSala(cine);
        System.out.println("----------SALA CON ESPECTADORES------------");
        cs.cargarEspectadores(cine);
        cs.datosCine(cine);
        cs.mostrarSala(cine);
        cs.datosCine(cine);
    }

}
