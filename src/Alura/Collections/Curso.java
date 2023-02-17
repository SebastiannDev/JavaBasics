package Alura.Collections;

public class Curso implements Comparable<Object> {
    private String nombre;
    private int tiempo;

    public Curso(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Curso [nombre=" + nombre + ", tiempo=" + tiempo + "]";
    }

    @Override
    public int compareTo(Object o) {
        Curso curso = (Curso) o;
        return this.getTiempo() - curso.getTiempo();
    }

}
