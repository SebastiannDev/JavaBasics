package InputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderEjercicio {

    public static void main(String[] args) {

        String path = "src/InputOutput/example";
        String file = path + "/fichero.txt";

        /* creando documento txt */
        // crearFichero(path);
        /* escribiendo documento txt */
        // escribirFichero(file);

        // leer fichero
        leerFichero(file);
    }

    public static void crearFichero(String path) {
        File fichero = new File(path, "fichero.txt");

        try {
            if (fichero.createNewFile()) {
                System.out.println("Fichero creado correctamente.");
            } else {
                System.out.println("Error al crear el documento");
            }
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }

    public static void escribirFichero(String file) {

        try {
            FileWriter document = new FileWriter(file);

            String str = "Hola mundo desde Java";
            document.write(str);
            document.close();

            System.out.println("Documento escrito correctamente");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void leerFichero(String file) {
        try {
            FileReader fichero = new FileReader(file);

            try {
                int i;
                while ((i = fichero.read()) != -1) {
                    System.out.println((char) i);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
