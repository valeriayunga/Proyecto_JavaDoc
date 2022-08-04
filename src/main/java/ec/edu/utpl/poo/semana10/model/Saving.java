package ec.edu.utpl.poo.semana10.model;

/**
 * La clase Saving representa una cuenta de ahorro.
 * Esta clase se extiende de la clase Account por lo cual define objetos igual que la clase Account, cuenta con métodos que permiten realizar un retiro y calcular el interés anual a pagar.
 * @author Valeria Alexandra Yunga Manzanillas.
 */
public class Saving extends Account {
    /**
     * Representa el interés que se genera anualmente por la cantidad de dinero prestado.
     */
    private double annualInterest;

    /**
     * Constructor parametrizado, permite crear una cuenta de ahorro a partir de los parámetros introducidos.
     * @param balance el parámetro balance define la cantidad de dinero que posee la cuenta corriente.
     * @param number el parámetro number define el número de la cuneta corriente.
     * @param annualInterest el parámetro annualInterest define el interés que se genera anualmente por la cantidad de dinero prestado.
     */

    public Saving(double balance, String number, double annualInterest) {
        super(balance, number);
        this.annualInterest = annualInterest;
    }

    /**
     * Permite realizar un retiro y registrar dicha transacción.
     * @param amount el parámetro amount define el monto de dinero que se retirará de el balance de la cuenta de ahorro.
     * @param reference l parámetro reference define el número de referencia que permite agregar una etiqueta personal a cada transacción.
     * @throws IllegalArgumentException genera una excepción(Indice fuera de los límites) si no es posible realizar la transacción ya que el saldo de la cuenta de ahorro es inferior a el monto que se quiere retirar.
     */

    public void withdraw(double amount, String reference) {
        validateAmount(amount);
        if(isTransactionPosible(amount)) {
            setBalance(getBalance() - amount);
            registerTransaction(TType.RET, amount, reference);
        } else {
            throw new IllegalArgumentException("Balance lower than amount");
        }
    }

    /**
     * Calcula el ineterés anual a pagar, realiza el pago y registra la transacción..
     * Establece el nuevo valor del saldo, usa el valor del saldo por el ineterés anual.
     * Registra el pago el el interés anual en una transacción.
     */

    public void payInterest() {
        var interestToPay = getBalance() * annualInterest / 100;
        setBalance( getBalance() * interestToPay );
        registerTransaction(TType.INT, interestToPay, "S/R");
    }
}