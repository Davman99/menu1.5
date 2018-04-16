/* Principal.java 15/04/2018
 * copyrigth (c) 2018 Jesus Roso, David Manosalba, Francisco Barrero
 */
package restaurante;
import GUI.interfaz.interfaz;
/**
 * La clase principal es la que llama a la interfaz principal
 * @author Jesus Roso
 * @author David Manosalba
 * @author Francisco Barrero
 * @version 1.4
 */
public class Main {

    public static void main(String[] args) {
       
        interfaz principal = new interfaz();
        principal.setVisible(true);
     
    }
    
 
}
