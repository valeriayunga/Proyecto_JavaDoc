package ec.edu.utpl.poo.semana10.model;

/**
 * La clase Cheking representa una cuenta corriente.
 * Esta clase se extiende de la clase Account por lo cual define objetos igual que la clase Account, cuenta con un métoddo que permite realizar un pago y registrar dicha transacción.
 * @author Valeria Alexandra Yunga Manzanillas.
 */


public class Checking extends Account {
    /**
     * Representa la cantidad de dinero para un sobregiro.
     */
    private double overDraft;

    /**
     * Constructor parametrizado, permite crear una cuenta corriente a partir de los parámetros introducidos.
     * Además valida que el dinero de la variable de sobregiro no pueda ser mayor a 1.5 veces el valor del balance de la cuenta corriente.
     * @param balance el parámetro balance define la cantidad de dinero que posee la cuenta corriente.
     * @param number el parámetro number define el número de la cuneta corriente.
     * @param overDraft el parámetro overDraft define la cantidad de dinero para un sobregiro.
     * @throws IllegalArgumentException genera una excepción(Indice fuera de los límites) si el sobregiro es mayor a 1.5 veces el valor del balance de la cuenta corriente.
     */

    public Checking(double balance, String number, double overDraft) {
        super(balance, number);
        if(overDraft < 1.5 * balance) {
            this.overDraft = overDraft;
        } else {
            throw new IllegalArgumentException("Overdraft cannot be greater than 1.5 times the balance");
        }
    }

    /**
     * Permite realizar un pago y registrar dicha transacción.
     * @param amount el parámetro amount define el monto de dinero con el que se realizará el pago.
     * @param reference el parámetro reference define el número de referencia que permite agregar una etiqueta personal a cada transacción.
     * @throws IllegalArgumentException genera una excepción(Indice fuera de los límites) si no es posible realizar la transacción ya que el dinero de el balance es insufiente como sustraer el monto necesario para realizar un pago.
     */

    public void payOver(double amount, String reference) {
        validateAmount(amount);
        if(isTransactionPosible(amount)) {
            setBalance( getBalance() - amount );
            registerTransaction(TType.PCH, amount, reference);
        } else {
            throw new IllegalArgumentException("Insufficient balance");
        }
    }
}