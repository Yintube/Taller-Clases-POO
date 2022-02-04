/**
 * Representa la clase CreditCard con su respectivo encapsulamiento de atributos y métodos.
 * @author Yineth Vargas Guerrero
 */
public class CreditCard {
    /**
     * Main o principal que permite la ejecución.
     * @param args 
     */
    public static void main(String[] args) {
        /**
         * Instanciación de la clase, nombrando creditCard como objeto.
         */
        CreditCard creditCard = new CreditCard();
        /**
         * Al no tener parámetros, muestra su dirección su dirección en memoria por consola.
         */
        System.out.println(creditCard);       
    }
    /**
     * Declaración de atributos.
     */
    private int id;
    protected int pinNumber;
    protected boolean activated;
    public String bank;
    /**
     * Encapsulamiento de atributos con los métodos Set y Get para 
     * establecer y obtener valor de atributos privados y protegidos.
     * @return 
     */       
    public boolean isActivated() {
        return activated;
    }


    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }
    /**
     * Crea una instancia de la clase CreditCard, permite proporcionar 
     * los parametros por medio de Set y Get. Constructor vacio.
     */    
    public CreditCard(){
    }
    /**
     * Crea una instancia de la clase CreditCard, proporcionando parámetros.constructor. Sobrecarga de constructores.
     * @param id
     * @param pinNumber
     * @param bank 
     * @param activated 
     */
    public CreditCard(int id, int pinNumber, String bank, boolean activated) {
        this();
        this.id = id;
        this.pinNumber = pinNumber;
        this.bank = bank;
        this.activated = activated;
    }
    /**
     * Método u operacion para validar activación de Credit Card.
     * @return 
     */
    public boolean seeActivated(){
        return true;
    }
    /**
     * Método u operación para mostrar Datos.
     */    
    public void showData(){
        System.out.println("Id: "+ id + "\nPin Number: " + pinNumber +"\nBank: " + bank);   
    }
}