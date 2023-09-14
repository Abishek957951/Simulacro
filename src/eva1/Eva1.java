//Autor: Abishek
package eva1;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Eva1 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
       ConexionFirebase.initFirebase();
       Operaciones operacion = new Operaciones();
       
       ArrayList<String> orden1 = new ArrayList<>();
       System.out.println("Ingrese el nombre del cliente");
       String nombre = s.nextLine();
       Cliente cliente1 = new Cliente(nombre,orden1);
       Menu.menu(cliente1);
       System.out.println("Su orden es: "+cliente1.orden.toString());
        try {
            operacion.save(cliente1);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Eva1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       ArrayList<String> orden2 = new ArrayList<>();
       System.out.println("Ingrese el nombre del cliente");
       String nombre2 = s.nextLine();
       Cliente cliente2 = new Cliente(nombre2,orden2);
       Menu.menu(cliente1);
       System.out.println("Su orden es: "+cliente2.orden.toString());
        try {
            operacion.save(cliente2);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Eva1.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}
