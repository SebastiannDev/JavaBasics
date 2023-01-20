package EstructurasControl;

public class Main {
    public static void main(String[] args) {

        /* --- if control statement --- */
        int edad = 17;
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        /* --- if / else if -- */
        String dia = "Lunes";

        if (dia.equals("Lunes")) {
            System.out.println("El dia es correcto");
        } else if (dia.equals("martes")) {
            System.out.println("Es martes");
        } else {
            System.out.println("No identificado");
        }

        /* --- switch --- */
        switch (dia) {
            case "Lunes":
                System.out.println("Hoy es lunes");
                break;
            case "Martes":
                System.out.println("Hoy es martes");
                break;
            default:
                System.out.println("Finalizo el programa...");
        }

        /* --- Bucle For --- */
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        /* --- Bucle For Each --- */
        String[] fruits = { "Apple", "Pineaple", "Grappes" };
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        /* --- Bucle While --- */
        int counter = 0;
        while (true) {
            counter++;
            System.out.println(counter);
            if (counter == 15) {
                break;
            }
        }
    }
}
