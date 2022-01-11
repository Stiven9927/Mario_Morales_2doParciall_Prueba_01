package deitel.com.mario_morales_2doparcial_prueba_01;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class UserDal {
    private user_helper user_helper;
    private SQLiteDatabase sql;
    private Context context;

    public UserDal(Context context) {

        this.context = context;
    }

    public void open(){
        user_helper = new user_helper(context, "userDB", null, 1);
        sql = user_helper.getWritableDatabase();

    }

    public void close(){
        sql.close();
    }

    public long insert(msmm_user user){
        long count = 0;
        try{
            open();
            ContentValues values = new ContentValues();

            ContentValues listaValores = new ContentValues();
            values.put("user", user.getUser());
            values.put("Password", user.getPassword());

            count = sql.insert("users", null, values);
        }
        catch (Exception e){
            throw e;
        }
        finally {
            sql.close();
        }
        return count;
    }
}
