import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Student on 6/26/2017.
 */
public class Main {
    public static void main(String [] args)
    {
        //Todo: fájlból kiolvassa az adatbázist
        ArrayList<User> userList= new ArrayList<>();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Add meg a végrehajtandó parancsot!");

        String action=scanner.nextLine().toLowerCase();
        switch (action)
        {
            case "regisztráció":
            {
                break;
            }
            default:
            {
                break;
            }
        }
    }
}
