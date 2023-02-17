package DatosAvanzados;

/*
 * Los arreglos son una coleccion de datos de un tipo
 * tienen la propiedad .lenght para conocer su tamaño
 * El arreglo debe contener previamente su tamaño si no se ha definido.
 * es posible mutarlos.
 * 
 * Los arreglos pueden ser multidimensionales
 */
public class DatoArray {
    public static void main(String[] args) {

        // arrego de enteros
        int[] array = new int[5]; // arreglo campos definidos
        int[] array1 = { 1, 2, 3 }; // arreglo datos definidos

        for (int i = 0; i < array.length; i++) {
            System.out.println(i); // imprime los indices del arreglo
        }

        System.out.println(array1); // imprime una referencia del arreglo
        System.out.println("");

        /* arreglo bidimencional */
        int arrayBidimensional[][] = new int[2][4];

        // rellenando un arreglo bidimencional...
        arrayBidimensional[0][0] = 2;
        arrayBidimensional[0][1] = 20;
        arrayBidimensional[0][2] = 200;
        arrayBidimensional[0][3] = 2000;

        arrayBidimensional[1][0] = 3;
        arrayBidimensional[1][1] = 30;
        arrayBidimensional[1][2] = 300;
        arrayBidimensional[1][3] = 3000;

        // recorriendo array bidimencional
        for (int i = 0; i < arrayBidimensional.length; i++) {
            System.out.println("El arreglo es de dimension: " + i);

            for (int j = 0; j < arrayBidimensional[i].length; j++) {
                System.out.println(arrayBidimensional[i][j]);
            }
        }
    }
}
