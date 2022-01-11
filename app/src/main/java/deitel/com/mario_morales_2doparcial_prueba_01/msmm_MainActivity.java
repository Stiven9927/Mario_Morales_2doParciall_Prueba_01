package deitel.com.mario_morales_2doparcial_prueba_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
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

    public void onClick(View view) {
        String usuario = user.getText().toString();
        String password = pass.getText().toString();
        if(user == "" || pass == ""){
            Toast.makeText(this, "Los datos son obligatorios.", Toast.LENGTH_SHORT).show();
        }
    }

    public void OnClickRegistrar(){
        Intent intent = new Intent(this, msmm_Activity2.class);
        startActivity(intent);
    }

    public void BuscarSinClase(View view){
        user_helper user_helper = new user_helper(this,
                "userDB", null, 1);

        SQLiteDatabase sql = user_helper.getReadableDatabase();//lectura

        String codigo = ed.getText().toString();


        String consulta = "SELECT Codigo, user, Password FROM Users WHERE Codigo=" + codigo;

        //Indices
        Cursor cursor = sql.rawQuery(consulta, null);
        //ciclo where
        if(cursor.moveToFirst())
        {
            user.setText(cursor.getString(1));
            pass.setText(cursor.getString(2));

        }else{
            Toast.makeText(this, "No se encontraron registros en la tabla", Toast.LENGTH_LONG).show();
        }
        sql.close();
    }
}