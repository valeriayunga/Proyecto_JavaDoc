package ec.edu.utpl.poo.semana10.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa una cuenta bancaria donde se pueden registrar 4 tipos transacciones.
 * Cuenta con métodos que permiten validar montos de dinero, relizar un depósito, agregar una transacción a una lista de transacciones, validar si es posible realizar una transacción, métodos set y get para cada atributo e imprimir una lista de transacciones.
 * @author Valeria Alexandra Yunga Manzanillas
 */
public class Account {
    /**
     * Representa el patrimonio neto contable de una cuenta bancaria.
     */
    private double balance;
    /**
     * Representa el número de la cuenta bancaria.
     */
    private String number;
    /**
     * Representa la fecha en que se abrió la cuenta bancaria.
     */
    private LocalDate openedAt;
    /**
     * Representa la lista de transacciones realizadas en la cuenta.
     */
    private List<Transaction> transactions;

    /**
     * Constructor de la clase Account.
     * Crea una instancia de la clase Account recibiendo como parámetros el balance de la cuenta y el número de cuenta.
     * @param balance el parámetro balance define la cantidad de dinero que posee la cuenta.
     * @param number el parámetro number define el número de la cuenta.
     */
    public Account(double balance, String number) {
        validateAmount(balance);
        this.balance = balance;
        this.number = number;
        this.openedAt = LocalDate.now();
        transactions = new ArrayList<>();
    }

    /**
     * Obtiene el balance de la cuenta.
     * @return devuelve el valor decimal del saldo de la cuenta.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Establece el valor del balance de la cuenta solo si este es válido.
     * @param balance el parámetro balance define la cantidad de dinero que posee la cuenta.
     */
    public void setBalance(double balance) {
        validateAmount(balance);
        this.balance = balance;
    }
    /**
     * Obtiene el número de cuenta.
     * @return devuelve como variable cadena el número de la cuenta bancaria.
     */
    public String getNumber() {
        return number;
    }
    /**
     * Establece el número de la cuenta bancaria.
     * @param number el parámetro number define el número de la cuenta.
     */
    public void setNumber(String number) {
        this.number = number;
    }
    /**
     * Obtiene la fecha en que se abrió la cuenta bancaria.
     * @return devuelve la fecha en que se abrió la cuenta bancaria.
     */
    public LocalDate getOpenedAt() {
        return openedAt;
    }
    /**
     * Registra un depósito solo si el monto a depositar es válido.
     * @param amount el parámetro amount define el monto a depositar.
     * @param reference el parámetro reference define el número de referencia que permite agregar una etiqueta personal a cada transacción.
     */
    public void deposit(double amount, String reference) {
        validateAmount(amount);
        balance += amount;
        registerTransaction(TType.DEP, amount, reference);
    }
    /**
     * Registra cada transacción en una lista.
     * @param type el parámetro type define el tipo de transacción.
     * @param amount el parámetro amount define el monto de dinero que se usó para realizar la transacción.
     * @param reference el parámetro reference define el número de referencia que permite agregar una etiqueta personal a cada transacción.
     */
    public void registerTransaction(TType type, double amount, String reference) {
        transactions.add(new Transaction(type, amount, reference));
    }
    /**
     * Valida que el monto de dinero sea mayor o igual a cero.
     * @param amount el parámetro amount define el monto de dinero a validar.
     * @throws IllegalArgumentException genera una excepción(Indice fuera de los límites) cuando el monto es menor a cero.
     */
    public void validateAmount(double amount) {
        if( amount <= 0 ) {
            throw new IllegalArgumentException("Amount is not valid");
        }
    }
    /**
     * Verifica si es posible realizar una transacción comprobando que el balance de la cuenta bancaria es mayor que el monto de dinero.
     * @return devuelve verdadero si es posible realizar la transacción (la cantidad de dinero en la cuenta es mayor que el monto), o devuleve falso si no es posible realizar la transacción (la cantidad de dinero en la cuenta es menor que el monto).
     */

    public boolean isTransactionPosible(double amount) {
        return balance > amount;
    }

    /**
     * Imprime la lista de transacciones realizadas en la cuenta de banco.
     */
    public void printTransactions() {
        for(var transaction : transactions) {
            System.out.println(transaction);
        }
    }
}