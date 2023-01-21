package POO.Interfaces.Ejercicio;

public class CocheCRUDImpl implements ICocheCRUD {

    @Override
    public void save() {
        System.out.println("Guardando datos de CocheCRUDImpl");
    }

    @Override
    public void findAll() {
        System.out.println("Mostrando todos los datos de CocheCRUDImpl");
    }

    @Override
    public void update() {
        System.out.println("Actualizando los datos de CocheCRUDImpl");

    }

    @Override
    public void delete() {
        System.out.println("Borrando los datos de CocheCRUDImpl");

    }

}
