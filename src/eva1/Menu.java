package eva1;

import java.util.Scanner;


public class Menu {
    
    static Scanner s = new Scanner(System.in);
    
    public static void menu(Cliente cliente){
        System.out.println("------------Bienvenidos------------");
        boolean pedido = true;
        while(pedido == true){
        System.out.println("El menú es el siguiente");
        System.out.println("(1)........Pescado.............$15.000");
        System.out.println("(2)........Pollo.............$12.000");
        System.out.println("(3)........Cerdo.............$17.000");
        System.out.println("----------------------------");
        System.out.println("Escoja una de las siguientes opciones indicando por el numero");
        int opcion = s.nextInt();
        switch(opcion){
            case 1 -> {
                Scanner d1 = new Scanner(System.in);
                cliente.orden.add("Pescado");
                System.out.println("Su pedido fue registrado con exito");
                System.out.println("¿Desea continuar?. Escriba -si- o -no-");
                String desicion = d1.nextLine();
                pedido = desicion.equals("si");
                }
            case 2 -> { 
                Scanner d2 = new Scanner(System.in);
                cliente.orden.add("Pollo");
                System.out.println("Su pedido fue registrado con exito");
                System.out.println("¿Desea continuar?. Escriba -si- o -no-");
                String desicion2 = d2.nextLine();
                pedido = desicion2.equals("si");
                }
            case 3 -> {
                Scanner d3 = new Scanner(System.in);
                cliente.orden.add("Cerdo");
                System.out.println("Su pedido fue registrado con exito");
                System.out.println("¿Desea continuar?. Escriba -si- o -no-");
                String desicion3 = d3.nextLine();
                pedido = desicion3.equals("si");
                }
            default -> System.out.println("La opcion que escogió no existe");   
        }
    }
    }
    
}
