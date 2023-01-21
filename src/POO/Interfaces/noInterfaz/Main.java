package POO.Interfaces.noInterfaz;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmpleadoCRUD crud = new EmpleadoCRUD();

        Empleado emp1 = new Empleado("Pepe", 23, 3000, false);
        Empleado emp2 = new Empleado("Sara", 29, 7000, false);
        Empleado emp3 = new Empleado("Ramón", 25, 5000, false);

        // Guardando empleados
        crud.guardar(emp1);
        crud.guardar(emp2);
        crud.guardar(emp3);

        // ver empleados
        List<Empleado> empleados = crud.imprimirEmpleados();
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }
}
