package POO.Clases;

import POO.Clases.Herencia.Camion;
import POO.Clases.Herencia.Motocicleta;

public class Main {
  public static void main(String[] args) {

    Motor motorGP = new Motor("MasterRacer", 22, 4, 60);

    Vehicle vehicle1 = new Vehicle("Toyota", "XB-200", 32.1, 2023, false, motorGP);
    System.out.println(vehicle1.company);

    /* --- Herencia --- */
    Motocicleta motocicleta1 = new Motocicleta();
    motocicleta1.modelVehicle = "ford";

    System.out.println("Fin programa");

    /* --- Polimorfismo --- */
    Vehicle vehiculo;

    vehiculo = new Motocicleta();
    vehiculo.accelerate(50);

    vehiculo = new Camion();
    vehiculo.accelerate(75);
  }
}
