package Entidades;

/**
 * Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en
 * cada póliza. Esas cuotas van a contener la siguiente información: número de
 * cuota, monto total de la cuota, si está o no pagada, fecha de vencimiento,
 * forma de pago (efectivo, transferencia, etc.).
 * @author facun
 */
public class Cuota {

    private int numeroDeCuota;
    private int montoTotal;
    private boolean pago;
    private String vencimiento;
    private String formaDePago;

    public Cuota() {
    }

    public Cuota(int numeroDeCuota, int montoTotal, boolean pago, String vencimiento, String formaDePago) {
        this.numeroDeCuota = numeroDeCuota;
        this.montoTotal = montoTotal;
        this.pago = pago;
        this.vencimiento = vencimiento;
        this.formaDePago = formaDePago;
    }

    public int getNumeroDeCuota() {
        return numeroDeCuota;
    }

    public void setNumeroDeCuota(int numeroDeCuota) {
        this.numeroDeCuota = numeroDeCuota;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    @Override
    public String toString() {
        return "Cuota{" + "numeroDeCuota=" + numeroDeCuota + ", montoTotal=" + montoTotal + ", pago=" + pago + ", vencimiento=" + vencimiento + ", formaDePago=" + formaDePago + '}';
    }
    
}
