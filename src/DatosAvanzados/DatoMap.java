package DatosAvanzados;

import java.util.HashMap;
import java.util.Map.Entry;

/*
 * Hash map es un tipo de datos [llave, valor]
 * no admiten valores duplicados
 * estos no son ordenados
 */
public class DatoMap {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("clave 1", 12);
        map.put("clave 2", 13);
        map.put("clave 3", 14);

        System.out.println(map);

        /* Obtener un valor especifico */
        System.out.println(map.get("clave 2"));
        System.out.println("");

        /* Remover una clave del map */
        map.remove("clave 1");

        /* recorrer un map */
        for (Entry<String, Integer> element : map.entrySet()) {
            System.out.println("La clave del map es: " + element.getKey());
            System.out.println("El elemento del map es: " + element.getValue());
        }
    }
}
