package teszt;

import étterem.Menü;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Student on 6/28/2017.
 */
public class MenüTeszt {
    public static void main(String [] args)
    {
        Scanner scanner=new Scanner(System.in);
        String filePath= scanner.nextLine();
        ArrayList<Menü> arrayList= new ArrayList<>();
        try {
            scanner = new Scanner(new File(filePath));
            scanner.useDelimiter("[;/]");
            while (scanner.hasNext())
            {
                if (scanner.next().equals("étel"))
                {
                    
                }
                else
                {

                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nincs ilyen fájl!");
        }
    }
}
