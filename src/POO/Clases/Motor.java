package POO.Clases;

public class Motor {

    String modeloMotor;
    int caballos;
    double parNm;
    int numCilindros;

    public Motor() {

    }

    public Motor(String modeloMotor, int caballos, double parNm, int numCilindros) {
        this.modeloMotor = modeloMotor;
        this.caballos = caballos;
        this.parNm = parNm;
        this.numCilindros = numCilindros;
    }

    public void ignicion() {
        System.out.println("El coche ha encendido...");
    }
}
