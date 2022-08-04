package ec.edu.utpl.poo.semana10.controller;

import ec.edu.utpl.poo.semana10.model.*;

/**
 * Clase principal, implementa la creación de cuentas utilizando la clase padre.
 */

public class Demos {
    /**
     * Este es el método main en el cual se han creado los objetos necesarios para el funcionamiento de un banco, se utilizó la clase padre Account para representar las cuentas y se imprimió una única transacción.
     * @param args Unused
     */
    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println(b);

        Transaction t = new Transaction(TType.INT,123,"abc");
        System.out.println(t);

        Account cuenta = new Saving(100,"001",5 );
        Account cuenta2 = new Checking(100,"002",3);


    }
}
