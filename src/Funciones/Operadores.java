package Funciones;

public class Operadores {

    public static void main(String[] args) {

        // aritmeticos
        int num1 = 22;
        int num2 = 37;
        int resultado = num1 + num2;

        // suma
        System.out.println(resultado);
        // resta
        System.out.println(num1 - num2);

        /*
         * Comparaciones
         * >
         * <
         * >=
         * >=
         * ==
         */

        boolean resultado1 = num1 > num2;
        System.out.println(resultado1);

        boolean resultado2 = num1 < num2;
        System.out.println(resultado2);

        /* --- Debugging... --- */

        // Operadores lógicos -> ( || &&)
        boolean resultado3 = num1 < num2 && num1 < 30;
        System.out.println(resultado3);

        /* --- Funciones --- */
        showMenu("Hola mundo desde una funcion en java B:");

        /* --- Funciones anonimas --- */
        // () -> System.out.println("Anonymous function");

        /* --- sobrecarga de funciones */
        resta(5, 7);
        resta(5, 2, 8);

    }

    public static void showMenu(String message) {
        System.out.println(message);
    }

    public static void resta(int num1, int num2) {
        System.out.println("sobrecarga 1: " + (num1 - num2));
    }

    public static void resta(int num1, int num2, int num3) {
        System.out.println("sobrecarga 2: " + (num1 - num2 - num3));
    }

}
