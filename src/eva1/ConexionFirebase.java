package eva1;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.FirebaseDatabase;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ConexionFirebase {
    public static FirebaseDatabase firebaseDatabase;
        public static void initFirebase() {
        try {
            FirebaseOptions firebaseOptions = new FirebaseOptions.Builder()
                    //Link de database que conecta a la base de datos
                    .setDatabaseUrl("https://ejemplo-oop-default-rtdb.firebaseio.com/")
                    //acceso a la clave que permite la conexión a la base de datos
                    .setServiceAccount(new FileInputStream(new File("C:\\Users\\abish\\OneDrive\\Escritorio\\OOP\\Intro-Fire-Base\\ejemplo-oop-firebase-adminsdk-xbgpm-7128869026.json")))
                    .build();
            FirebaseApp.initializeApp(firebaseOptions);
            firebaseDatabase = FirebaseDatabase.getInstance();
            System.out.println("Conexión exitosa....");
        }catch (RuntimeException ex) {
            System.out.println("Problema ejecucion ");
        }catch (FileNotFoundException ex) {
            System.out.println("Problema archivo");
        }  
    }    
}
