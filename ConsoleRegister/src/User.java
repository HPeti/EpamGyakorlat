import java.util.ArrayList;
import java.util.Scanner;

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
    private static boolean verifyAll(User user, String passwordVerify) {
        return Validate.verifyName(user.getName()) && Validate.verifyEmail(user.getEmail()) && Validate.verifyAddress(user.getAddress()) && Validate.verifyAge(user.age) && Validate.verifyPassword(user.getPassword(), passwordVerify);
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
        boolean modified=false;
        for (User item : userList) {
            if (item.getName().equals(input)) {
                System.out.print("\nAdd meg, hogy mit akarsz módosítani!(név, cím, e-mail, kor, [jelszó?]):");
                switch (scanner.nextLine()) {
                    case "név": {
                        System.out.println("Add meg az új nevet! (meglévő: "+item.getName()+")");
                        String newName=scanner.nextLine();
                        if (Validate.verifyName(newName))
                        {
                            item.setName(newName);
                            modified=true;
                        }
                        else
                        {
                            System.out.println("Nem megfelelő név! (minimum 2 tagú legyen a név)");
                        }
                        break;
                    }
                    case "cím": {
                        System.out.println("Add meg az új címet! (meglévő: "+item.getAddress()+")");
                        String newAddress=scanner.nextLine();
                        if (Validate.verifyAddress(newAddress))
                        {
                            item.setAddress(newAddress);
                            modified=true;
                        }
                        else
                        {
                            System.out.println("Nem megfelelő cím! minimum 4 tagú legyen a cím vesszővel elválasztva)");
                        }
                        break;
                    }
                    case "e-mail": {
                        System.out.println("Add meg az új e-mail címet! (meglévő: "+item.getEmail()+")");
                        String newEmail=scanner.nextLine();
                        if (Validate.verifyEmail(newEmail))
                        {
                            item.setEmail(newEmail);
                            modified=true;
                        }
                        else
                        {
                            System.out.println("Nem megfelelő e-mail cím!");
                        }
                        break;
                    }
                    case "kor": {
                        System.out.println("Add meg az új kort! (meglévő: "+item.getAge()+")");
                        int newAge=Integer.parseInt(scanner.nextLine());
                        if (Validate.verifyAge(newAge))
                        {
                            item.setAge(newAge);
                            modified=true;
                        }
                        else
                        {
                            System.out.println("Nem megfelelő kor! (kor>0)");
                        }
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

    private void setName(String name)
    {
        this.name=name;
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
