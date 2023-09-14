package eva1;

import java.util.ArrayList;

public class Cliente {
    
    public String nombre;
    public ArrayList<String> orden = new ArrayList<>();
    
    public Cliente(String nombre, ArrayList orden){
        this.nombre = nombre;
        this.orden = orden;
    }
}
