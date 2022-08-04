/**
 * En este paquete contine clases relacionadas entre sí a través de la herencia, las cuales permiten el funcionamineto de un banco.
 * Estas clases no solo permiten la creación de un banco con multiples cuentas de sus clientes, sinó que también llevan un registro tanto de los clientes como de las transacciones que son realizadas en cada cuenta.
 */
package ec.edu.utpl.poo.semana10.model;

import java.util.ArrayList;
import java.util.List;
/**
 * Representa un banco con su nombre y su lista de clientes.
 * @author Valeria Alexandra Yunga Manzanillas
 */

public class Bank {
    /**
     * Representa el nombre de el banco.
     */
    private String name;
    /**
     * Representa la lista de clientes del banco.
     */
    private List<Client> clients;

    /**
     * Constructor de la clase Bank sin parámetros que crea una lista de clientes del banco.
     */
    public Bank() {
        clients = new ArrayList<>();
    }
    /**
     * Constructor de la clase Bank.
     * Crea una instancia de la clase Bank recibiendo como parámetro el nombre del banco.
     * @param name el parámetro name define el nombre del banco.
     */

    public Bank(String name) {
        this();
        this.name = name;
    }
    /**
     * Obtiene la lista de clientes que posee el banco.
     * @return devuelve la lista de clientes que posse el banco.
     */
    public List<Client> getClients() {
        return clients;
    }
    /**
     * Establece la lista de clientes que posee el banco recibiendo como parámetro una lista de clientes.
     * @param clients el parámetro clients define la lista de clientes.
     */
    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    /**
     * Agrega un cliente a la lista de clientes que possee el banco.
     * @param client el parámetro client representa al cliente que será agregado a la lista.
     */

    public void addClient(Client client) {
        clients.add( client );
    }

    /**
     * Obtiene el nombre del banco.
     * @return devuelve el nombre del banco.
     */
    public String getName() {
        return name;
    }
}
