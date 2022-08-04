package ec.edu.utpl.poo.semana10.model;

import java.util.List;
/**
 * Esta clase define a los clientes de un banco.
 * @author Valeria Alexandra Yunga Manzanillas
 */

public class Client {
    /**
     * Representa la cédula de identidad del cliente.
     */
    private String documentId;
    /**
     * Representa el apellido del cliente.
     */
    private String surname;
    /**
     * Representa el nombre del cliente.
     */
    private String name;
    /**
     * Representa la lista de cuentas que posee el cliente.
     */
    private List<Account> accounts;

    /**
     * Constructor parametrizado, permite crear un cliente a partir de los parámetros introducidos.
     * @param documentId el parámetro documentId define el número de cédula de el cliente.
     * @param surname el parámetro surname define el apellido del cliente.
     * @param name el parámetro name define el nombre del cliente.
     */
    public Client(String documentId, String surname, String name) {
        this.documentId = documentId;
        this.surname = surname;
        this.name = name;
    }

    /**
     * Constructor parametrizado, permite crear un cliente a partir de los parámetros introducidos.
     * @param documentId el parámetro documentId define el número de cédula de el cliente.
     * @param surname el parámetro surname define el apellido del cliente.
     * @param name el parámetro name define el nombre del cliente.
     * @param accounts el parámetro accounts define la lista de cuentas que posee el cliente.
     */
    public Client(String documentId, String surname, String name, List<Account> accounts) {
        this.documentId = documentId;
        this.surname = surname;
        this.name = name;
        this.accounts = accounts;
    }

    /**
     * Obtienen la cédula del cliente.
     * @return devuelve el número de cédula del cliente en una variable de tipo cadena.
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Establece el número de cédula que tiene el cliente.
     * @param documentId el parámetro documentId define el número de cédula de el cliente.
     */
    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    /**
     * Obtiene el apellido del cliente.
     * @return devuelve del apellido del cliente.
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Establece apellido del cliente.
     * @param surname el parámetro surname define el apellido del cliente.
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Obtiene el nombre del cliente.
     * @return devuelve le nombre del cliente.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre del cliente.
     * @param name el parámetro name define el nombre del cliente.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Ohtiene la lista dec cuentas que posee el cliente.
     * @return devuelve la lista dec cuentas que posee el cliente.
     */
    public List<Account> getAccounts() {
        return accounts;
    }

    /**
     * Establece una lista de cuentas para el cliente.
     * @param accounts el parámetro accounts define la lista de cuentas que posee el cliente.
     */
    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
