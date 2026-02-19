package model;

public class Cuenta {
    // Declaramos las tres variables
    private String platform;
    private String user;
    private String password;

    public Cuenta(String platform, String user, String password) {
        // Creamos el Constructor
        this.platform = platform;
        this.user = user;
        this.password = password;
    }

    // Primero creamos los getters

    public String getplatform() {
        return platform;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    // Por último los setters

    public void setplatform(String platform) {
        this.platform = platform;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
