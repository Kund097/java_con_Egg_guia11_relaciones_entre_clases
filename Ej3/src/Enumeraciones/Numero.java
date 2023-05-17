
package Enumeraciones;

/**
 *
 * @author facun
 */
public enum Numero {
    
    UNO("1"),DOS("2"),TRES("3"),CUATRO("4"),CINCO("5"),SEIS("6"),SIETE("7"),DIEZ("10"),ONCE("11"),DOCE("12");
    
    private final String descripcion;

    private Numero(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
}
