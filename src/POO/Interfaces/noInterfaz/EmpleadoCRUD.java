package POO.Interfaces.noInterfaz;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD {

    private List<Empleado> empleados = new ArrayList<>();

    public void guardar(Empleado empleado) {
        empleados.add(empleado);
    }

    public List<Empleado> imprimirEmpleados() {
        return empleados;
    }

}
