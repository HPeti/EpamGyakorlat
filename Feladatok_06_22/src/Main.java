import java.util.Scanner;

/**
 * Created by Student on 6/22/2017.
 */
public class Main {
    public static String zarojel(String text)
    {
        char [] chars= text.toCharArray();
        String valasz = "Hiba";
        if(chars.length==0) {
            valasz = "Üres karakterlánc";
        }
        else {
            int db = 0;
            if (chars[0] == '(') {
                for (int i = 0; i < chars.length; i++) {
                    if (chars[i] == '(') {
                        db++;
                    } else if (chars[i] == ')') {
                        db--;
                    } else {
                        valasz = "Nem helyes karakter bemenet";
                    }
                }
                if (db == 0) {
                    valasz = "Helyes";
                }
            } else {
                valasz = "Nem helyes";
            }
        }
        return valasz;
    }
    public static void calculator(String kifejezes)
    {

    }
    public static void kozosResz(String [] tomb)
    {

    }

    public static void main(String [] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Feladat 1: Zárójelek");
        System.out.print("\nAdd meg a zárójeleket: ");
        System.out.println(zarojel(scanner.nextLine()));
        System.out.println("Feladat 2: Számológép");
        System.out.print("\nAdj meg egy aritmetikai kifejezést");
        calculator(scanner.nextLine());
        System.out.println("Feladat 3: Közös rész a stringbe");

    }
}
