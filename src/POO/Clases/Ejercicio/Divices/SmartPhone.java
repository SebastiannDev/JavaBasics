package POO.Clases.Ejercicio.Divices;

public class SmartPhone extends SmartDivice {

    boolean linterna;
    boolean is5G;

    public SmartPhone(String marca, String modelo, double pulgadas, int carga_mAh, int nCamaras, String color,
            boolean linterna, boolean is5g) {
        super(marca, modelo, pulgadas, carga_mAh, nCamaras, color);
        this.linterna = linterna;
        is5G = is5g;
    }

}
