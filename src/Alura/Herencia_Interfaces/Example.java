package Alura.Herencia_Interfaces;

interface Ejemplo {
    String hello = "Hello :#";

    void saludar();
}

public class Example implements Ejemplo {
    public static void main(String[] args) {

        System.out.println(hello);
        Ejemplo ex = new Example();
        ex.saludar();
    }

    @Override
    public void saludar() {
        System.out.println("Hello from an interface");

    }
}
