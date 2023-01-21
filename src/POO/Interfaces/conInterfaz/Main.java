package POO.Interfaces.conInterfaz;

import POO.Interfaces.noInterfaz.Empleado;

public class Main {

    private static EmpleadoCRUD empleadocrud = new EmpleadoEXCEL();

    public static void main(String[] args) {

        empleadocrud.findAll();
        empleadocrud.save(new Empleado());
    }
}
