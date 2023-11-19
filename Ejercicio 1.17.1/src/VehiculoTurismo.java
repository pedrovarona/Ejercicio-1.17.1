
public class VehiculoTurismo extends Vehiculo {
    private int numeroPlazas;

    public VehiculoTurismo(int numeroPlazas, double precioBase) {
        super("", "", precioBase); 
        this.numeroPlazas = numeroPlazas;
    }

    @Override
    public double calcularPrecioFinal() {
        if (numeroPlazas <= 5) {
            return getPrecioBase();
        } else {
            return getPrecioBase() * (1 + 0.1 * (numeroPlazas - 5));
        }
    }
}
