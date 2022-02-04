/**
 * Representa la clase Product con su respectivo encapsulamiento de atributos y métodos.
 * @author Yineth Vargas Guerrero
 */
public class Product {
   /**
    * Main o principal que permite la ejecución.
    * @param args 
    */ 
    public static void main(String[] args) {
        /**
         * Instanciación de la clase, nombrando product como objeto.
         */
        Product product = new Product();
        /**
        * Al no tener parametros, muestra su direccion en memoria en la consola
        */
        System.out.println(product); 
    }
    /**
     * Declaración de atributos.
     */
    public String name;
    private int id;
    private float averageWeight;
    private float amount;
    /**
     * Encapsulamiento de atributos con el método Get para obtener valor.
     * @return 
     */
    public int getId() {
        return id;
    }
    /**
     * Encapsulamiento de atributos con el método Set para establecer valor.
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Encapsulamiento de atributos con el método Get para obtener valor.
     * @return 
     */
    public float getAverageWeight() {
        return averageWeight;
    }
    /**
     * Encapsulamiento de atributos con el método Set para establecer valor.
     * @param averageWeight 
     */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }
    /**
     * Encapsulamiento de atributos con el método Get para obtener valor.
     * @return 
     */
    public float getAmount() {
        return amount;
    }
    /**
     * Encapsulamiento de atributos con el método Set para establecer valor.
     * @param amount 
     */
    public void setAmount(float amount) {
        this.amount = amount;
    }
    /**
     * Crea una instancia de la clase Product, permite proporcionar 
     * los parametros por medio de Set y Get. Constructor vacio.
     * Sobrecarga de constructores.
     */
    public Product() {
    }
    /**
     * Crea una instancia de la clase Product, proporcionado parámetros.Constructor
     * @param id
     * @param name
     * @param averageWeight
     * @param amount
     */
    public Product (int id,String name, int averageWeight, float amount) {  
        this();
        this.id = id;
        this.name = name;
        this.averageWeight = averageWeight;
        this.amount = amount;
    }
    /**
     * Método u operación para sumar cantidades de producto.
     * @param amount 
     */
    public void addAmount(int amount){
        this.amount = this.amount + amount;     
    }
    /**
     * Método u operación para restar cantidades de producto.
     * @param amount 
     */
    public void substractAmount(int amount){
        this.amount = this.amount - amount;
    }
    /**
     * Método u operacion para traer y mostrar los datos.
     */
    public void showData(){
        System.out.println("Id: "+ id + "\nName: " + name +"\nAverage Weight " + averageWeight +
                   "\nAmount " + amount);
    }
    
}
    
