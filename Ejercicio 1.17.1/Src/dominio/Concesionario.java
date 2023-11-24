package dominio;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Concesionario implements Serializable {
    private static final long serialVersionUID = 1L;

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

    public void serializar(String nombreArchivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            oos.writeObject(this);
            System.out.println("Concesionario serializado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Concesionario deserializar(String nombreArchivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            return (Concesionario) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
