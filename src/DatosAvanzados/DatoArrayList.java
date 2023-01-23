package DatosAvanzados;

import java.util.ArrayList;
import java.util.List;

public class DatoArrayList {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");

        // remover
        lista.remove("Elemento 2");

        // recorrer
        for (String string : lista) {
            System.out.println(string);
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
