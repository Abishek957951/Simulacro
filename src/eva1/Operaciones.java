package eva1;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Operaciones {
        private DatabaseReference mDatabase;
        Random r = new Random();
    
        public void save(Cliente cliente) throws FileNotFoundException {
        if (cliente != null) {
            mDatabase = FirebaseDatabase.getInstance().getReference().child("Clientes");
            CountDownLatch countDownLatch = new CountDownLatch(1);
            mDatabase.child("100001").setValue(cliente, (DatabaseError de, DatabaseReference dr) -> {
                System.out.println("Registro guardado!");
                countDownLatch.countDown();
            });
            try {
                countDownLatch.await();
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
