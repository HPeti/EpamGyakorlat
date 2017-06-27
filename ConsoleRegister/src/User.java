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

    public User(String name, String address, String email, int age, String password) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.age = age;
        this.password = password;
    }
    private static boolean verifyName(String name)
    {
        int nameSize = name.split(" ").length;
        return nameSize>1;
    }
    private static boolean verifyEmail(String email)
    {
        return email.contains("@")&&email.contains(".");
    }
    private static boolean verifyAddress(String address)
    {
        int addressSize=address.split(",").length;
        return addressSize==4;
    }
    private static boolean verifyPassword(String password, String passwordVerify)
    {
        return password.equals(passwordVerify);
    }
    private static boolean verifyAll(User user, String passwordVerify) {
        return verifyName(user.getName()) && verifyEmail(user.getEmail()) && verifyAddress(user.getAddress()) && verifyPassword(user.getPassword(), passwordVerify);
    }

    public static void create(ArrayList<User> userList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nAdd meg a felhasználó nevét:");
        String name = scanner.nextLine();
        System.out.print("\nAdd meg a címét(Irányítószám, település, utca, házszám): ");
        String address = scanner.nextLine();
        System.out.print("\nAdd meg az e-mail címét: ");
        String email = scanner.nextLine();
        System.out.print("\nAdd meg az életkorát: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("\nAdd meg a jelszavát (min. 8 karakter): ");
        String password = scanner.nextLine();
        System.out.print("\nJelszó megerősítés: ");
        String passwordVerify = scanner.nextLine();
        User tempUser = new User(name, address, email, age, password);
        if (verifyAll(tempUser, passwordVerify)) {
            System.out.println("Felhasználó létrehozva!");
            userList.add(new User(name, address, email, age, password));
        } else {
            System.out.println("Rossz bemeneti paraméterek!");
        }
    }

    public static void listázás(ArrayList<User> userList) {
        System.out.println("Felhasználó neve \t címe \t e-mail címe \t életkora");
        for (User item : userList) {
            System.out.println(item.getName() + "\t" + item.getAddress() + "\t" + item.getEmail() + "\t" + item.getAge());
        }
    }

    public static void modify(ArrayList<User> userList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nAdd meg, hogy melyik felhasználón akarsz módosítani!(név): ");
        String input = scanner.nextLine();
        boolean modified = false;
        for (User item : userList) {
            if (item.getName().equals(input)) {
                System.out.print("\nAdd meg, hogy mit akarsz módosítani!(név, cím, e-mail, kor, [jelszó?]):");
                switch (scanner.nextLine()) {
                    case "név": {
                        modified = true;
                        break;
                    }
                    case "cím": {
                        modified = true;
                        break;
                    }
                    case "e-mail": {
                        modified = true;
                        break;
                    }
                    case "kor": {
                        modified = true;
                        break;
                    }
                    default: {
                        System.out.println("Rossz módosító szó");
                        break;
                    }

                }
            }
        }
    }

    public static void delete(ArrayList<User> userList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg, hogy melyik felhasználót akarod törölni(név)!: ");
        String input = scanner.nextLine();
        boolean deleted = false;
        for (User item : userList) {
            if (item.getName().equals(input)) {
                deleted = true;
                userList.remove(item);
                break;
            }
        }
        if (deleted) {
            System.out.println("Felhasználó törölve.");
        } else {
            System.out.println("Nincs ilyen felhasználó!");
        }

    }

    private String getName() {
        return name;
    }

    private String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    private String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String getPassword() {
        return password;
    }

}
