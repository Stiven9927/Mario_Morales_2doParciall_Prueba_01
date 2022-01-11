package deitel.com.mario_morales_2doparcial_prueba_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class msmm_Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msmm2);
    }

    private void insertar() {

        ClienteDAL dal=new ClienteDAL(this);

        String user = editTextNombre.getText().toString();
        String password = editTextApellido.getText().toString();

        if(us.matches("") || apellido.matches("")){
            Toast.makeText(this, "Los datos son obligatorios.", Toast.LENGTH_SHORT).show();
            return;
        }

        Cliente cliente=new Cliente();

        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setCorreo(correo);
        long cantidad=dal.insert(cliente);

        editTextNombre.setText("");
        editTextApellido.setText("");
        editTextCorreo.setText("");

        Toast.makeText(this, "Se insertó un cliente", Toast.LENGTH_SHORT).show();
    }
}