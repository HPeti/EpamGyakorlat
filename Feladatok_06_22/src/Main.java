import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Student on 6/22/2017.
 */
public class Main {
    public static void main(String [] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Feladat 1: Zárójelek");
        System.out.print("Add meg a zárójeleket: ");
        System.out.println(Brackets.zarojel(scanner.nextLine()));

        System.out.println("Feladat 2: Számológép");
        System.out.print("\nAdj meg egy aritmetikai kifejezést"); //a sorrendet meg kell valósítani
        Calculator.calc(scanner.nextLine());

        System.out.println("Feladat 3: Közös rész a stringbe");
        int max=0;
        int temp=0;


    }
}
