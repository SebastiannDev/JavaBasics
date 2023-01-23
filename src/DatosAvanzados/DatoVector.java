package DatosAvanzados;

import java.util.Vector;

/*
 * Los vectores o arrays dinamicos, empiezan con una capacidad de 10,
 * e incrementan en 10 dinamicamente, esta operacion dinamica se realiza con
 * un costo de operacion considerable copiando y creando una nueva copia 
 * de un arreglo.
 */
public class DatoVector {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();
        vector.add(5);
        vector.add(6);
        vector.add(7);
        System.out.println("Los datos del vector son: " + vector);

        // podemos eliminar indices:
        vector.remove(1);
        System.out.println("El vector ahora tiene solo dos datos: " + vector);

        // tamaños y capacidades:
        System.out.println(vector.size());
        System.out.println("La capacidad del vector es: " + vector.capacity());
        System.out.println("******************");

        // comparando vectores
        Vector<Integer> vector2 = new Vector<>();
        vector2.add(5);
        vector2.add(7);
        boolean resultado = vector.equals(vector2);
        System.out.println("el vector comprado es: " + resultado);

        // Podemos reducir el tamaño con trimToSize()
        // esto crea un nuevo arreglo que ocupara solo el espacio llenado
    }
}
