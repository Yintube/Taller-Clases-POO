/**
 * Representa la clase BankAccount. BankAccount es una clase hija de CreditCard,
 * heredando atributos y métodos de la clase CreditCard.
 * @author Yineth Vargas Guerrero
 */
public class BankAccount extends CreditCard {
    /**
     * Declaración de atributo.
     */
    private int accountNumber;
    /**
     * Encapsulamiento de atributos con los métodos Set y Get para 
     * establecer y obtener valor de atributos privados y protegidos.
     * @return 
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    /**
     * Constructor de la clase. 
     * @param accountNumber 
     */
    public BankAccount(int accountNumber) {
       this.accountNumber = accountNumber;
    }
    /**
     * Constructor de la clase, invoca atributos y métodos de la clase padre.
     * @param accountNumber
     * @param id
     * @param pinNumber
     * @param bank
     * @param activated 
     */
    public BankAccount(int accountNumber, int id, int pinNumber, String bank, boolean activated) {
        super(id, pinNumber, bank, activated);
        this.accountNumber = accountNumber;
    }   
}
