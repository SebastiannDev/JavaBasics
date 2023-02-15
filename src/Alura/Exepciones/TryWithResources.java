package Alura.Exepciones;

public class TryWithResources {

    public static void main(String[] args) throws Exception {

        try (Conexion conexion = new Conexion()) {
            conexion.leerDatos();
        } catch (IllegalStateException ex) {
            System.out.println("Surgió un error en la conexión ");
        }
    }

}

class Conexion implements AutoCloseable {

    public Conexion() {
        System.out.println("Abriendo conexión");
    }

    public void leerDatos() {
        System.out.println("Recibiendo datos");
        throw new IllegalStateException();
    }

    public void cerrar() {
        System.out.println("Cerrando conexión ");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Cerrando Conexion");
    }
}
