package deitel.com.mario_morales_2doparcial_prueba_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class msmm_Activity2 extends AppCompatActivity {

    private EditText editTextCodigo;
    private EditText editTextUser;
    private EditText editTextPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msmm2);
    }

    private void insertar() {

        UserDal dal=new UserDal(this);

        String user = editTextUser.getText().toString();
        String password = editTextPass.getText().toString();

        if(user.matches("") || password.matches("")){
            Toast.makeText(this, "Los datos son obligatorios.", Toast.LENGTH_SHORT).show();
            return;
        }

        msmm_user Usuario =new msmm_user();

        Usuario.setUser(user);
        Usuario.setUserPassword(password);
        long cantidad=dal.insert(user);

        editTextPass.setText("");
        editTextUser.setText("");

        Toast.makeText(this, "Se registro un usuario", Toast.LENGTH_SHORT).show();
    }
}