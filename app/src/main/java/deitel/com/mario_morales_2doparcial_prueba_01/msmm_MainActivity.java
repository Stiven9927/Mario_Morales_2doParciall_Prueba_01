package deitel.com.mario_morales_2doparcial_prueba_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class msmm_MainActivity extends AppCompatActivity {

    private EditText user;
    private EditText pass;
    private Button aceptar;
    private Button registrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.msmm_activity_main);

        user = findViewById(R.id.User_editText);
        pass = findViewById(R.id.Pass_editText);
        aceptar = findViewById(R.id.Acep_button);
        registrar = findViewById(R.id.Regis_button2);
    }

    private void onClick(View view) {

        if(user.matches("") || pass.matches("")){
            Toast.makeText(this, "Los datos son obligatorios.", Toast.LENGTH_SHORT).show();
            return;
        }
    }

    public void OnClickRegistrar(){
        Intent intent = new Intent(this, msmm_Activity2.class);
        startActivity(intent);
    }

}