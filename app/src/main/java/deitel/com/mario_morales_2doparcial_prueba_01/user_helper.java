package deitel.com.mario_morales_2doparcial_prueba_01;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class user_helper extends SQLiteOpenHelper {

    private String createTable_Users = "CREATE TABLE Users " +
            "(Codigo INTEGER PRIMARY KEY AUTOINCREMENT, user TEX, Password TEXT)";

    public user_helper(@Nullable Context context, @Nullable String user,
                          @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, user, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        //ejecutar el SQL para crear la estrucutura de las tablas
        sqLiteDatabase.execSQL(createTable_Users);
        //sql:segunda
        //sql:tercera
        //vistas, triggers, etc.
        //sqLiteDatabase.execSQL("INSERT INTO Cliente.....");
        //sqLiteDatabase.execSQL("INSERT INTO CLIENTES.....");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        //Borrar tabla
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS Users");
        //sql para crear la tabla o tablas con la nueva estructura
        //sqLiteDatabase.execSQL(CreateTable_Clientes_modificada);
        sqLiteDatabase.execSQL(createTable_Users);
    }
}
