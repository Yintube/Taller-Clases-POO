/**
 * Importación de la libreria ArrayList.
 */
import java.util.ArrayList;
/**
 * Representa la clase Meat con sus atributos y métodos.
 * @author Yineth Vargas Guerrero.
 */
public class Meat {
    /**
     * Main, permite su ejecución.
     * @param args 
     */
    public static void main(String[] args) {
        /**
         * Instanciación de la clase, nombrando meat como objeto.
         */
        Meat meat = new Meat();
        /**
         * Al no tener parametros, muestra su direccion en memoria por consola.
         */
        System.out.println(meat);
        /**
         * Declaramos la variable ArrayList 
         */
        ArrayList typeMeat = new ArrayList ();
        /**
         * Agregamos valor a la variable typeMeat con add.
         */
        typeMeat.add("beef");
        typeMeat.add("pork");
        typeMeat.add("fish");
        
        System.out.println("Mostrar tipos de carnes disponibles: " + typeMeat.toString());
    }
    /**
     * Declaración de atributos.
     */
    ArrayList<String> typeMeat; //Anteriormente ya lo habia creado con el objeto.
    public double price;
    public int amount;
    private float averageWeight;
    /**
     * En esta ocasión decidí implementar métodos Set y Get a todos los atributos, tanto publicos como 
     * privados. Sin embargo recordemos que estos métodos son para los privados y protegidos. 
     * @return 
     */
    public ArrayList<String> getTypeMeat() {
        return typeMeat;
    }

    public void setTypeMeat(ArrayList<String> typeMeat) {
        this.typeMeat = typeMeat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }
    /**
     * Crea una instancia de la clase Meat, permite proporcionar 
     * los parámetros por medio de Set y Get. Constructor vacio. 
     */
    public Meat(){
    }
    /**
     * Crea una instancia de la clase Fruit, proporcionado parámetros.Constructor
     * @param typeMeat
     * @param price
     * @param amount
     * @param averageWeight 
     */
    public Meat(ArrayList<String> typeMeat, double price, int amount, float averageWeight) {
        this();
        this.typeMeat = typeMeat;
        this.price = price;
        this.amount = amount;
        this.averageWeight = averageWeight;
    }
    /**
     * Método u operación para saber el tipo de carne. Con arreglo.
     * @param typeMeat 
     */
    public void seeTypeMeat(String typeMeat){   
        for (int i = 0; i < typeMeat.length(); i++) {
            System.out.println("Type Meat" + typeMeat);    
    }
              
    }
}