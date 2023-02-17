package DatosAvanzados;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

        // filtrar con streams
        Entity persona1 = new Entity("Jose", 25);
        Entity persona2 = new Entity("maria", 50);
        Entity persona3 = new Entity("Raul", 5);
        Entity persona4 = new Entity("Patricia", 15);

        ArrayList<Entity> personas = new ArrayList<>();
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);

        var elementos = personas.stream()
                .filter(e -> !e.getNombre().equalsIgnoreCase("maria"))
                .sorted(Comparator.comparingInt(Entity::getNumero).reversed())
                .collect(Collectors.toList());

        System.out.println(elementos);
    }
}
