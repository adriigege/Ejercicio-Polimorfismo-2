package model;

public class Jugador {
    private String login;
    private String password;
    private String correo;

    public Jugador(String login, String password, String correo) {
        this.login = login;
        this.password = password;
        this.correo = correo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "|--- Jugador ---|\n" +
                "| login= '" + login + '\'' +
                " | password= '" + password + '\'' +
                " | correo= '" + correo + '\'';
    }
}
