import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Student on 6/26/2017.
 */
public class Main {
    public static void main(String [] args)
    {
        //Todo: fájlból kiolvassa az adatbázist, make more salt

        ArrayList<User> userList= new ArrayList<User>();
        Scanner scanner= new Scanner(System.in);
        boolean exit=false;
        while (!exit)
        {
            boolean createdUser=false;
            System.out.println("Add meg a végrehajtandó parancsot! (regisztráció - 1, listázás - 2, módosítás - 3, törlés - 4, kilépés - 0)");
            String action = scanner.nextLine().toLowerCase();

            switch (action) {
                case "regisztráció": {
                    User.create(userList);
                    break;
                }
                case "2":
                case "listázás": {
                    User.listázás(userList);
                    break;
                }
                case "3":
                case "módosítás": {
                     User.modify(userList);
                    break;
                }
                case "4":
                case "törlés":
                {
                    User.delete(userList);
                }
                case "0":
                case "kilépés":
                {
                    System.out.println("A program kilép...");
                    exit=true;
                    break ;
                }
                default: {
                    break;
                }
            }
        }
    }
}
