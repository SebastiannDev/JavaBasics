package Funciones;

public class EjercicioTema2 {

    public static void main(String[] args) {

        double papas = 12.99;

        var valor = calculaIva(papas);
        System.out.println(valor);

    }

    public static double calculaIva(double price) {
        double precioIva = (price / 100) * 12;
        return precioIva + price;
    }
}
