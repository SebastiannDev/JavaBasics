package POO.Clases.Ejercicio.Divices;

public class SmartDivice {

    String marca;
    String modelo;
    String color;
    double pulgadas;
    int carga_mAh;
    int nCamaras;

    public SmartDivice() {

    }

    public SmartDivice(String marca, String modelo, double pulgadas, int carga_mAh, int nCamaras, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.pulgadas = pulgadas;
        this.carga_mAh = carga_mAh;
        this.nCamaras = nCamaras;
    }

    public void mostrarDispositivo() {
        System.out.println(
                "Soy un " + marca + " " + modelo + " y tengo: " + pulgadas + "', mi bateria cuenta con una carga de: "
                        + carga_mAh + "mAh, y tengo: " + nCamaras + " camaras...");
    }
}
