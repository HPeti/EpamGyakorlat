import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Student on 6/26/2017.
 */
public class User {
    private String name;
    private String address;
    private String email;
    private int age;
    private String password;

    public User(String name, String address, String email, int age, String password)
    {
        this.name=name;
        this.address=address;
        this.email=email;
        this.age=age;
        this.password=password;
    }
    public static void modify(ArrayList<User> lista)
    {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
