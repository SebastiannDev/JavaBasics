package POO.Interfaces.conInterfaz;

import java.util.List;

import POO.Interfaces.noInterfaz.Empleado;

public interface EmpleadoCRUD {

    public void save(Empleado empleado);

    public List<Empleado> findAll();

    public void delete(Empleado empleado);
}
