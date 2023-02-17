package Alura.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_y_Streams {

    public static void main(String[] args) {

        Curso curso1 = new Curso("Matematicas", 15);
        Curso curso2 = new Curso("Español", 20);
        Curso curso3 = new Curso("Ingles", 40);
        Curso curso4 = new Curso("Programación", 30);

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        Collections.sort(cursos);

        cursos.forEach(curso -> {
            System.out.println("Curso: " + curso);
        });

        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).sum());
        System.out.println(cursos.stream().mapToDouble(Curso::getTiempo).average().getAsDouble());
        System.out.println(cursos.stream().mapToDouble(Curso::getTiempo).max().getAsDouble());
    }
}
