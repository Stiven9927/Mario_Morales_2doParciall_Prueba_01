package deitel.com.mario_morales_2doparcial_prueba_01;

public class msmm_user {
    private int codigo;
    private String user;
    private String password;

    public msmm_user() {

    }

    public msmm_user(int codigo, String user, String password) {
        this.codigo = codigo;
        this.user = user;
        this.password = password;

    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getUser() {
        return user;
    }

    public void setPassword(String nombre) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

}
