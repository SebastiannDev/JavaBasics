package DatosAvanzados;

import java.util.LinkedList;

public class DatoLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Elemento link 1");
        list.add("Elemento link 2");
        list.add("Elemento link 3");

        list.addFirst("Elemento link 4");

        for (String string : list) {
            System.out.println(string);
        }
    }
}
