/**
 * Importación de la librería Date.
 */
import java.util.Date;
/**
 *Representa la clase Person con su respectivo encapsulamiento de atributos y métodos.
 * @author Yineth Vargas Guerrero.
 */
public class Person {
    /**
     * Main o principal que permite la ejecución.
     * @param args 
     */
    public static void main(String[] args) {
        /**
         * Creación de objeto, nombrandolo person.
         */ 
        Person person = new Person();
        /**
        * Al no tener parametros, muestra su direccion en memoria por consola        * 
        */
        System.out.println(person);           
    }
    /**
     * Declaraci{on de atributos.
     */
    public String name;
    public String lastName1;
    public String lastName2;
    private int id;
    public Date dateBirth;
    public float height;
    /**
     * Encapsulamiento de atributos con los métodos Set y Get para establecer y obtener valor de atributos privados.
     * @return 
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    /**
     * Crea una instancia de la clase Person, permite proporcionar 
     * los parametros por medio de Set y Get. Constructor vacio.
     */
    public Person() {
    }
    /**
     * Crea una instancia de la clase Person, proporcionando parámetros. Constructor.
     * Sobrecarga de constructores.
     * @param name
     * @param lastName1
     * @param lastName2
     * @param id
     * @param dateBirth
     * @param height 
     */
    public Person(String name, String lastName1, String lastName2, int id, Date dateBirth, float height) {
        this();
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.id = id;
        this.dateBirth = dateBirth;
        this.height = height;
    }
    /**
     * Método u operación para mostrar Datos.
     */
    public void showData(){
        System.out.println("Name: "+ name + "\nLast Name 1: " + lastName1 +"\nLast Name 2: " + lastName2 + 
                "\nId: " + id + "\nDate Birth: " + dateBirth + "\nHeight: " + height);
        }
    
}
