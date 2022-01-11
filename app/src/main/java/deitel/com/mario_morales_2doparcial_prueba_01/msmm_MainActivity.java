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

    EditText user, pass;
    Button aceptar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.msmm_activity_main);

        user = findViewById(R.id.User_editText);
        pass = findViewById(R.id.Pass_editText);
        aceptar = findViewById(R.id.Acep_button);

     aceptar.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            if(user.getText().toString() == "" && pass.getText().toString() == ""){

                Toast.makeText(msmm_MainActivity, "Correcto", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(msmm_MainActivity, "Credenciales Incorrectas", Toast.LENGTH_SHORT).show();
             }
         }

     });
    }

    public void OnClickregistrar(View view){
        Intent intent = new Intent(this, msmm_Activity2.class);
        startActivity(intent);
    }

}