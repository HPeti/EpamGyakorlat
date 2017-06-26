import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Student on 6/26/2017.
 */
public class Main {
    public static boolean verifyUser(String name, String address, String email, int age, String password, String passwordVerify)
    {
        int nameSize = name.split(" ").length;
        boolean emailCim=email.contains("@") && email.contains(".");
        int addressSize = address.split(",").length;
        if(nameSize>1 && addressSize==4 && age>0 && password.equals(passwordVerify))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String [] args)
    {
        //Todo: fájlból kiolvassa az adatbázist; modify elkészítése metódusban

        ArrayList<User> userList= new ArrayList<User>();
        Scanner scanner= new Scanner(System.in);
cycle:  while (true) {
            boolean createdUser=false;
            System.out.println("Add meg a végrehajtandó parancsot! (regisztráció - 1, listázás - 2, módosítás - 3, törlés - 4, kilépés - 0");

            String action = scanner.nextLine().toLowerCase();
            switch (action) {
                case "1":
                case "regisztráció": {
                    System.out.print("\nAdd meg a felhasználó nevét: ");
                    String name=scanner.nextLine();
                    System.out.print("\nAdd meg a felhasználó címét(vesszővel elválasztva!): ");
                    String address=scanner.nextLine();
                    System.out.print("\nAdd meg a felhasználó e-mail címét: ");
                    String email=scanner.nextLine();
                    System.out.print("\nAdd meg a felhasználó életkorát: ");
                    int age=Integer.parseInt(scanner.nextLine());
                    System.out.print("\nAdd meg a felhasználó jelszavát: ");
                    String password=scanner.nextLine();
                    System.out.print("\nJelszó megerősítés: ");
                    String passwordVerify=scanner.nextLine();
                    if(verifyUser(name,address,email,age,password,passwordVerify))
                    {
                        userList.add(new User(name,address,email,age,password));
                        System.out.println("Új felhasználó létrehozása?(i / n)");
                        if(scanner.nextLine().charAt(0)=='n')
                        {
                            createdUser=true;
                        }
                    }
                    else
                    {
                        System.out.println("Rossz paraméterek kerültek be");
                    }
                    break;
                }
                case "2":
                case "listázás": {
                    System.out.println("Felhasználó neve \t címe \t e-mail címe \t életkora");
                    for (User item : userList)
                    {
                        System.out.println(item.getName()+ "\t"+ item.getAddress()+ "\t"+  item.getEmail()+ "\t"+  item.getAge());
                    }
                    break;
                }
                case "3":
                case "módosítás": {
                    break;
                }
                case "4":
                case "törlés":
                {

                }
                case "0":
                case "kilépés":
                {
                    System.out.println("A program kilép...");
                    break cycle;
                }
                default: {
                    break;
                }
            }
            if (createdUser)
            {
                break cycle;
            }
        }
    }
}
