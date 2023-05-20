
package Entidades;

/**
 *Marca,
modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
 * @author facun
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int ano;
    private String numeroMotor;
    private String chasis;
    private String color;
    private String tipo;
    private Cliente propietario;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int ano, String numeroMotor, String chasis, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.numeroMotor = numeroMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(String numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cliente getPropietario() {
        return propietario;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    
    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", numeroMotor=" + numeroMotor + ", chasis=" + chasis + ", color=" + color + ", tipo=" + tipo + '}';
    }
    
    
}
