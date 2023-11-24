package dominio;
public class Furgoneta extends Vehiculo {
    private double capacidadM3;

    public Furgoneta(double capacidadM3, double precioBase) {
        super("", "", precioBase); 
        this.capacidadM3 = capacidadM3;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase() * 0.5 * Math.cbrt(capacidadM3);
    }
}