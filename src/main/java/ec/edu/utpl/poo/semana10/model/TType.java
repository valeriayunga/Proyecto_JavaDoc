package ec.edu.utpl.poo.semana10.model;

/**
 * Enumeración para especificar el tipo de transacción.
 */
public enum TType {
    /**
     * Representa un depósito.
     */
    DEP, //Depósito
    /**
     * Representa un retiro.
     */
    RET, //Retiro
    /**
     * Representa el pago de un cheque.
     */
    PCH, //Pago Cheque
    /**
     * Representa el pago de intereses.
     */
    INT, //Intereses
    /**
     * Representa una deuda que se debe pagar.
     */
    DEB  //Débito
}
