package model;

public class Cuenta {
    private String platform;
    private String user;
    private String password;

    public Cuenta(String platform, String user, String password) {
        this.platform = platform;
        this.user = user;
        this.password = password;
    }

    public String getplatform() {
        return platform;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public void setplatform(String platform) {
        this.platform = platform;
    }

    public void setUser(String user) {
        this.user = this.user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
