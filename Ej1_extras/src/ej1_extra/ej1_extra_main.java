package ej1_extra;

import Entidades.Perro;
import Entidades.Persona;
import Service.AdopcionService;
import java.util.ArrayList;

/**
 *
 * @author facun
 */
public class ej1_extra_main {

    public static void main(String[] args) {
        AdopcionService as = new AdopcionService();
        ArrayList<Persona> personas = as.fabricaPersonas();
        ArrayList<Perro> perros = as.fabricaPerros();
        as.mostrarLista(personas);
        as.mostrarLista(perros);
    }

}
