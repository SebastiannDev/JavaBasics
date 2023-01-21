package POO.Clases.Herencia;

import POO.Clases.Motor;
import POO.Clases.Vehicle;

public class Motocicleta extends Vehicle {

    boolean baul;

    public Motocicleta() {

    }

    public Motocicleta(String company, String modelVehicle, double cc, int year, boolean sport, Motor motor,
            boolean baul) {
        super(company, modelVehicle, cc, year, sport, motor);
        this.baul = baul;
    }
}
