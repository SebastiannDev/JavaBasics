package EstructurasControl;

/*
 * En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
 * Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
 * String[] nombres = {"", "", "", ""}
 */
public class Ejercicio {
    public static void main(String[] args) {
        String[] frases = { "Coding ", "in ", "Java" };
        String fraseConcatenada = "";
        for (int i = 0; i < frases.length; i++) {
            fraseConcatenada += frases[i];
        }

        System.out.println(fraseConcatenada);
    }
}
