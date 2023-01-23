package InputOutput.Ejercicio;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*
 * Ejercicios de OpenBootcamp Java tema 10.Entrada/Salida
 */
public class Main {
    public static void main(String[] args) {

        /*
         * Dada la función:
         * public static String reverse(String texto) { }
         * Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena
         * "hola mundo", debe retornar "odnum aloh". [x]
         */
        String wordReversed = reverse("Hola mundo");
        System.out.println(wordReversed);
        System.out.println("");

        /*
         * Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus
         * valores.
         */
        String[] letras = { "Hola", "Open", "Bootcamp", ":D" };
        for (String letra : letras) {
            System.out.println(letra);
        }
        System.out.println("");

        /*
         * Crea un array bidimensional de enteros y recórrelo, mostrando la posición y
         * el valor de cada elemento en ambas dimensiones.
         */
        Integer[][] enteros = {
                { 1, 2, 3, 4, 5 },
                { 10, 20, 30, 40, 50 },
                { 123, 456, 789, 987, 654 }
        };

        for (Integer[] dimension : enteros) {
            for (Integer valor : dimension) {
                System.out.println(valor);
            }
        }
        System.out.println("");

        /*
         * Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
         * Elimina el 2o y 3er elemento y muestra el resultado final.
         */
        Vector<String> vector = new Vector<>();

        vector.add("Maria");
        vector.add("Carlos");
        vector.add("David");
        vector.add("Paula");
        vector.add("Ramiro");

        vector.remove(1);
        vector.remove(1);

        vector.forEach((element) -> System.out.println(element));
        System.out.println("");

        /*
         * Indica cuál es el problema de utilizar un Vector con la capacidad por defecto
         * si tuviésemos 1000 elementos para ser añadidos al mismo.
         * 
         * R//> El vector toma la cantidad de elementos actuales y duplica su espacio
         * disponible
         * por debajo de código está copiando y creando un nuevo array con una capacidad
         * el doble.
         */

        /*
         * Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
         * Recorre ambos mostrando únicamente el valor de cada elemento.
         */
        List<String> elementos = new ArrayList<>();

        elementos.add("Manzana");
        elementos.add("Piña");
        elementos.add("Pera");
        elementos.add("Mandarina");

        List<String> linkedElements = new LinkedList<>(elementos);
        linkedElements.forEach((el) -> System.out.println(el));
        System.out.println("");

        /*
         * Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos
         * 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares.
         * Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves,
         * puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de
         * relleno.
         */

        List<Integer> elementos2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            elementos2.add(i);
        }

        for (int i = 0; i < elementos2.size(); i++) {
            if (elementos2.get(i) % 2 == 0) {
                elementos2.remove(i);
            }
            System.out.println(elementos2.get(i));
        }
        System.out.println("");

        /*
         * Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a
         * su llamante del tipo ArithmeticException que será capturada por su llamante
         * (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el
         * mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso:
         * "Demo de código".
         */

        try {
            DividePorCero(2, 0);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse: " + e.getMessage());
        } finally {
            System.out.println("Demo de código");
        }
        System.out.println("");

        /*
         * Utilizando InputStream y PrintStream, crea una función que reciba dos
         * parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la
         * copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
         */

        /*
         * Sorpréndenos creando un programa de tu elección que utilice InputStream,
         * PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
         */

    }

    public static String reverse(String texto) {
        // String reverse;
        String reverse = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            reverse += "" + texto.charAt(i);
        }
        return reverse;
    }

    public static void reverse2(String texto) {
        String str = texto, nstr = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); // extracts each character
            nstr = ch + nstr; // adds each character in front of the existing string
        }
        System.out.println("Reversed word: " + nstr);
    }

    public static void DividePorCero(int num1, int num2) throws ArithmeticException {
        var resultadoDividendo = num1 / num2;
        System.out.println(resultadoDividendo);
    }
}
