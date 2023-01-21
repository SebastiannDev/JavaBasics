package POO.Clases;

public class Vehicle {

  /* --- Attributes --- */
  String company;
  public String modelVehicle;
  double cc;
  int year;
  int velocity;
  boolean sport;

  Motor motor;

  /* Constructors */
  public Vehicle() {

  }

  public Vehicle(String company, String modelVehicle, double cc, int year, boolean sport, Motor motor) {
    this.company = company;
    this.modelVehicle = modelVehicle;
    this.cc = cc;
    this.year = year;
    this.sport = sport;
    this.motor = motor;
  }

  /* --- Methods --- >= */
  public void accelerate(int quantity) {
    this.velocity += quantity;
    System.out.println("Estoy acelerando a: " + this.velocity);
  }
}
