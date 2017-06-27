import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

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
    public static void create(ArrayList<User> userList)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.print("\nAdd meg a felhasználó nevét:");
        String name=scanner.nextLine();
        System.out.print("\nAdd meg a címét(Irányítószám, település, utca, házszám): ");
        String address=scanner.nextLine();
        System.out.print("\nAdd meg az e-mail címét: ");
        String email=scanner.nextLine();
        System.out.print("\nAdd meg az életkorát: ");
        int age=Integer.parseInt(scanner.nextLine());
        System.out.print("\nAdd meg a jelszavát: ");
        String password=scanner.nextLine();
        System.out.print("\nJelszó megerősítés(min. 8 karakter): ");
        String passwordVerify=scanner.nextLine();
        if(Validator.verify(name,address,email,age,password,passwordVerify))
        {
            System.out.println("Felhasználó létrehozva!");
            userList.add(new User(name,address,email,age,password));
        }
        else
        {
            System.out.println("Rossz bemeneti paraméterek!");
        }
    }
    public static void modify(ArrayList<User> userList)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.print("\nAdd meg, hogy melyik felhasználón akarsz módosítani!(név): ");
        String input= scanner.nextLine();
        boolean modified=false;
        for (User item : userList)
        {
            if (item.getName()==input)
            {
                System.out.print("\nAdd meg, hogy mit akarsz módosítani!(név, cím, e-mail, kor, [jelszó?]):");
            }

        }
    }
    public static void delete(ArrayList<User> userList)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Add meg, hogy melyik felhasználót akarod törölni(név)!: ");
        String input= scanner.nextLine();
        boolean deleted=false;
        for (User item : userList)
        {
            if (item.getName()==input)
            {
                deleted=true;
                userList.remove(item);
                break;
            }
        }
        if (deleted)
        {
            System.out.println("Felhasználó törölve.");
        }
        else
        {
            System.out.println("Nincs ilyen felhasználó!");
        }

    }

    public String getName() {
        return name;
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

}
