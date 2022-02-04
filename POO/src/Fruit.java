/**
 * Importación de la librería ArrayList. 
 */
import java.util.ArrayList;
/**
 * Representa la clase Fruit con sus atributos y métodos.
 * @author Yineth Vargas Guerrero
 */    
public class Fruit {
    /**
     * Main, permite su ejecución.
     * @param args 
     */
    public static void main(String[] args) {
        /**
         * Instanciación de la clase, nombrando fruit como objeto.         * 
         */
        Fruit fruit = new Fruit();
        /**
         * Al no tener parametros, muestra su direccion en memoria en la consola
         */
        System.out.println(fruit);         
        /**
         * Declaramos variable ArrayList
         */
        ArrayList colors = new ArrayList ();
        /**
         * Agregamos valor a la variable colors con add.
         */
        colors.add("rojo");
        colors.add("amarillo");
        colors.add("verde");
        /**
         * Imprime colores existentes.
         */
        System.out.println("Mostrar colores existentes: " + colors.toString());
        
    }
    /**
     * Declaración de atributos.
     */    
    ArrayList<String> colors; // Tipo de dato ArrayList. 
    public String name;    
    public double price;
    private float averageWeight; 
     
    /**
     * Encapsulamiento de atributos con el método Get para obtener el valor.
     * @return 
     */
    public float getAverageWeight() {
        return averageWeight;
    }
    /**
     * Encapsulamiento de atributos con el método Set para establecer el valor.
     * @param averageWeight 
     */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }
    /**
     * Crea una instancia de la clase Fruit, permite proporcionar 
     * los parametros por medio de Set y Get. Constructor vacio.
     */
    public Fruit() {     
    }
    /**
     * Crea una instancia de la clase Fruit, proporcionado parámetros.Constructor
     * @param colors
     * @param name
     * @param price
     * @param averageWeight 
     */
    public Fruit(ArrayList<String> colors, String name, double price, float averageWeight) {
        this();
        this.colors = colors;
        this.name = name;
        this.price = price;
        this.averageWeight = averageWeight;
    }
    /**
     * Método u operación para ver colores diponibles, con un arreglo.
     * @param colors 
     */
    public void seeColors(String colors){   
        for (int i = 0; i < colors.length(); i++) {
            System.out.println("colors" + colors);           
        }
    }
    /**
     * Método u operacion para mostrar los datos.
     */
    public void showData(){
        System.out.println("Average Weight " + averageWeight + "\nColor: " + colors +
                   "\nPrice " + price + "\nName " + name);    
    
    }
    
}
    
    
    
    






