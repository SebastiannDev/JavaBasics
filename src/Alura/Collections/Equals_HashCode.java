package Alura.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class Equals_HashCode {

    /**
     * HashSet = una coleccion de elementos no ordenados que no permite duplicados
     * LinkedHashSet = una coleccion de elementos que no permite duplicados
     * TreeSet = una coleccion de elementos ordenados de forma natural y no permite
     * duplicados
     * Estos requiren el uso de entitades generar un HashCode y como recomendacion
     * un equals.
     */
    public static void main(String[] args) {

        Curso curso1 = new Curso("Español", 23);
        Curso curso2 = new Curso("Informatica", 45);
        Curso curso3 = new Curso("Matematicas", 30);
        Curso curso4 = new Curso("Ingles", 12);

        HashSet<Curso> hashCursos = new HashSet<>();
        hashCursos.add(curso1);
        hashCursos.add(curso2);
        hashCursos.add(curso3);
        hashCursos.add(curso4);

        Curso curso5 = new Curso("Ingles", 12);

        System.out.println(curso4.equals(curso5));
        System.out.println(hashCursos.contains(curso5));

        // Iterator
        Iterator<Curso> iterator = hashCursos.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
