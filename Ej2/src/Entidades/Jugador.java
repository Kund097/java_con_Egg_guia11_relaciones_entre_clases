package Entidades;

/**
 * Clase Jugador: esta clase posee los siguientes atributos: id (representa el
 * número del jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por
 * ejemplo) y mojado (indica si está mojado o no el jugador). El número de
 * jugadores será decidido por el usuario, pero debe ser entre 1 y 6. Si no está
 * en este rango, por defecto será 6.
 *
 * @author facun
 */
public class Jugador {
    private String id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
        
    }

    public Jugador(String id, String nombre) {
        this.id = id;
        this.nombre = nombre +" "+ id;
        mojado = false;
    }

    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
}
