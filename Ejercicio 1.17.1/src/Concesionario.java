
import java.util.ArrayList;
import java.util.List;

public class Concesionario {
    private List<Vehiculo> catalogo = new ArrayList<>();

    public void agregarVehiculo(Vehiculo vehiculo) {
        catalogo.add(vehiculo);
    }

    public void mostrarCatalogo() {
        for (Vehiculo vehiculo : catalogo) {
            System.out.println("Tipo: " + vehiculo.getClass().getSimpleName() +
                    ", Precio Final: " + vehiculo.calcularPrecioFinal() + " euros");
        }
    }

    public double obtenerPrecioTotal() {
        double precioTotal = 0;
        for (Vehiculo vehiculo : catalogo) {
            precioTotal += vehiculo.calcularPrecioFinal();
        }
        return precioTotal;
    }
}
