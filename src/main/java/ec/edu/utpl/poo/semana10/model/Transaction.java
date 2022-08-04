package ec.edu.utpl.poo.semana10.model;

import java.time.LocalDateTime;

/**
 * La clase Transaction representa una transacción. Las transacciones se identifican por su tipo, monto, referencia y su fecha de realización.
 */
public class Transaction {
    /**
     * Representa el tipo de transacción.
     */
    private TType type;
    /**
     * Representa la cantidad de dinero que se usó en la transacción.
     */
    private double amount;
    /**
     * Representa el número de referencia que permite etiquetar de forma personalizada cada transacción.
     */
    private String reference;
    /**
     * Representa la fecha en que se realizó la transacción.
     */
    private LocalDateTime dateTime;

    /**
     * Constructor parametrizado, permite crear una transacción a partir de los parámetros introducidos.
     * @param type el parámetro type define el tipo de transacción.
     * @param amount el parámetro amount define el monto de dinero que se usó para realizar la transacción.
     * @param reference el parámetro reference define el número de referencia que permite agregar una etiqueta personal a cada transacción.
     */

    public Transaction(TType type, double amount, String reference) {
        this.type = type;
        this.amount = amount;
        this.reference = reference;
        dateTime = LocalDateTime.now();
    }

    /**
     * Obtiene el tipo de transacción.
     * @return devuelve el tipo de transacción.
     */
    public TType getType() {
        return type;
    }

    /**
     * Obtienen el monto que se utilizó oara realizar la transacción.
     * @return devuelve el monto que se utilizó oara realizar la transacción.
     */

    public double getAmount() {
        return amount;
    }

    /**
     * Obtiene el número de referencia de la transacción.
     * @return devuelve en una variable cadena el número de referencia de la transacción.
     */

    public String getReference() {
        return reference;
    }

    /**
     * Obtiene la fecha en que se realizó la transacción.
     * @return devuelve la fecha en que se realizó la transacción.
     */
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    /**
     * Sobreescribe el método toString, retorna una cadena con el tipo de transacción, el monto utlizado en la transacción, la referencia de la transacción y la fecha en que se realizó.
     * @return devuelve una cadena con el valor de los atributos en una determinada instancia de una transacción.
     */
    @Override
    public String toString() {
        return String.format("%s\t%f\t%s\t%s",
                type.toString(),
                amount,
                reference,
                dateTime
                );
    }
}
