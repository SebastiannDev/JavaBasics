package InputOutput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamEjercicio {
    public static void main(String[] args) {
        BufferInputExample();
    }

    /**
     * Toma "trozos" de datos de bytes que considere listos para ser leidos.
     */
    public static void BufferInputExample() {
        try {
            /* lee el directorio del documento */
            InputStream fichero = new FileInputStream("src/InputOutput/example/fichero.txt");
            BufferedInputStream fileBuffer = new BufferedInputStream(fichero);

            try {
                int dato = fileBuffer.read();

                /* itera y convierte los bytes a char para ser mostrados */
                while (dato != -1) {
                    System.out.println((char) dato);
                    dato = fileBuffer.read();
                }
                /* cierra el scanner */
                fichero.close();

                /* captura la excepcion de apertura de archivos */
            } catch (IOException e) {
                /* muestra el mensaje ocurrido del posible error */
                System.out.println("No se puede leer el fichero: " + e.getMessage());
            }
            /* captura la excepcion de busqueda de ficheros. */
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * toma todos los bytes de un documento que pueden ser manipulados
     */
    public static void FileInputStreamExample() {
        try {
            /* lee el directorio del documento */
            InputStream fichero = new FileInputStream("src/InputOutput/example/fichero.txt");

            try {
                /* almacena los bytes del contenido en un arreglo */
                byte[] dato = fichero.readAllBytes();

                /* itera y convierte los bytes a char para ser mostrados */
                for (byte b : dato) {
                    System.out.println((char) b);
                }

                /* cierra el scanner */
                fichero.close();

                /* captura la excepcion de apertura de archivos */
            } catch (IOException e) {
                /* muestra el mensaje ocurrido del posible error */
                System.out.println("No se puede leer el fichero: " + e.getMessage());
            }
            /* captura la excepcion de busqueda de ficheros. */
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
