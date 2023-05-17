
package Enumeraciones;

/**
 *
 * @author facun
 */
public enum Palo {
    
    ESPADA("Espada"),BASTO("Basto"),ORO("Oro"),COPA("Copa");
    
    private final String descripcion;

    private Palo(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
}
