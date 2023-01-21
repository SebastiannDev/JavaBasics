package POO.Clases.Ejercicio;

import POO.Clases.Ejercicio.Divices.SmartDivice;
import POO.Clases.Ejercicio.Divices.SmartPhone;
import POO.Clases.Ejercicio.Divices.SmartWatch;

/*
 * En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
 * Agregaréis atributos tal cual tendrían esos objetos en la realidad.
 * Crear constructor vacío y con todos los parámetros para cada clase.
 * Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
 */
public class Main {
    public static void main(String[] args) {

        // SmartPhone
        SmartDivice smartPhone1 = new SmartPhone("Samsung", "A10", 14.2, 3200, 4, "azul", true, true);
        smartPhone1.mostrarDispositivo();

        // SmartWatch
        SmartDivice smartWatch1 = new SmartWatch("Nokia", "P20", 1.5, 1200, 1, "Gris", true, false);
        smartWatch1.mostrarDispositivo();

    }
}
