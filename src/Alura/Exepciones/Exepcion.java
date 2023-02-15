package Alura.Exepciones;

public class Exepcion {
    public static void main(String[] args) {

        System.out.println("Inicio de main. ");
        metodo1();
        System.out.println("Find de main");
    }

    static void metodo1() {
        System.out.println("Inicio método 1. ");
        throw new miExepcion("Lanzando mi propia excepción. ");
        // metodo2();
        // System.out.println("Fin método 1. ");
    }

    static void metodo2() {
        System.out.println("Inicio método 2. ");
        ArithmeticException ex = new ArithmeticException();
        System.out.println("Fin método 2. ");
        throw ex;
    }
}

class miExepcion extends RuntimeException {

    public miExepcion() {
        super();
    }

    public miExepcion(String message) {
        super(message);
    }
}
