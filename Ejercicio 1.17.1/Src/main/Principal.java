package main;

import dominio.Concesionario;
import dominio.Furgoneta;
import dominio.VehiculoTurismo;

public class Principal {
    public static void main(String[] args) {
        
        Concesionario concesionario = new Concesionario();

        concesionario.agregarVehiculo(new Furgoneta(10.0, 20000.0));
        concesionario.agregarVehiculo(new VehiculoTurismo(4, 15000.0));
        concesionario.agregarVehiculo(new Furgoneta(15.0, 25000.0));
        concesionario.agregarVehiculo(new VehiculoTurismo(7, 18000.0));

       
        System.out.println("Catálogo de vehículos:");
        concesionario.mostrarCatalogo();

        double precioTotal = concesionario.obtenerPrecioTotal();
        System.out.println("\nPrecio total del catálogo: " + precioTotal + " euros");

      
        concesionario.serializar("concesionario_serializado.ser");

       
        Concesionario concesionarioDeserializado = Concesionario.deserializar("concesionario_serializado.ser");

        if (concesionarioDeserializado != null) {
            System.out.println("\nConcesionario Deserializado:");
            concesionarioDeserializado.mostrarCatalogo();
            System.out.println("\nPrecio total del catálogo deserializado: "
                    + concesionarioDeserializado.obtenerPrecioTotal() + " euros");
        }
    }
}
