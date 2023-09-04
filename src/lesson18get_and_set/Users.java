package lesson18get_and_set;

public class Users {
    private String email;
    private int password;
    private String name;

    public Users(String email, int password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Users{" +
                "email='" + email + '\'' +
                ", password=" + password +
                ", name='" + name + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
