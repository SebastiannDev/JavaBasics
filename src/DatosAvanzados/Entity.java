package DatosAvanzados;

public class Entity {

    private String nombre;
    private int numero;

    public Entity(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Entity [nombre=" + nombre + ", numero=" + numero + "] ";
    }

}
