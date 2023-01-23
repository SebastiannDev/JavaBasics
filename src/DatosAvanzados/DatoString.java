package DatosAvanzados;

public class DatoString {
    public static void main(String[] args) {
        String cadena = "Hola mundo";

        // tamaño
        int cadenaLenght = cadena.length();
        System.out.println(cadenaLenght);

        // convertir a minusculas
        String cadenaMinuscula = cadena.toLowerCase();
        System.out.println(cadenaMinuscula);

        // convertir a mayusculas
        String cadenaMay = cadena.toUpperCase();
        System.out.println(cadenaMay);

        // cadena empieza por:
        boolean result = cadena.startsWith("Holu");
        System.out.println(result);

        // cadena termina por:
        boolean result2 = cadena.endsWith("ndo");
        System.out.println("La cadena termina por ndo?: " + result2);

        // selecciona una letra de la cadena:
        char letra = cadena.charAt(6);
        System.out.println("El caracter seleccionado de la cadena es: " + letra);

    }
}
