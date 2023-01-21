package POO.Clases.Ejercicio.Divices;

public class SmartWatch extends SmartDivice {

    boolean sensorCalor;
    boolean botones;

    public SmartWatch() {

    }

    public SmartWatch(String marca, String modelo, double pulgadas, int carga_mAh, int nCamaras, String color,
            boolean sensorCalor, boolean botones) {
        super(marca, modelo, pulgadas, carga_mAh, nCamaras, color);
        this.sensorCalor = sensorCalor;
        this.botones = botones;
    }

}
