package teszt;

import menza.Etel;
import menza.NincsIlyenTermékException;
import menza.Termek;
import étterem.Menü;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MenüTeszt {
    private static void outPrice(ArrayList<Termek> termeklista)
    {   int összeg=0;
        Scanner scanner= new Scanner(System.in);
        for (Termek item: termeklista)
        {
            System.out.println("Add meg a kért mennyiséget! "+item.toString());
            int db=Integer.parseInt(scanner.nextLine());
            összeg+=(Integer.parseInt(item.getPrice())*db);

        }
        System.out.println("A megadott mennyiségekre vonatkozó összeg "+összeg+" Ft");
    }
    public static void main(String [] args)
    {
        System.out.println("");
        Scanner scanner=new Scanner(System.in);
        String filePath= scanner.nextLine();
        ArrayList<Termek> arrayList= new ArrayList<>();
        try {
            scanner = new Scanner(new File(filePath));
            scanner.useDelimiter("[;/]");
            while (scanner.hasNext())
            {
                String termekType=scanner.next();
                String name=scanner.next();
                String amount=scanner.next();
                String price=scanner.next();
                if (termekType.equals("étel"))
                {
                    if ("leves".equals(scanner.next()))
                    {
                        arrayList.add(new Etel(name,amount,price,1));
                    }
                    else
                    {
                        arrayList.add(new Etel(name,amount,price,2));
                    }
                }
                else
                {
                    if ("alkoholos".equals(scanner.next()))
                    {
                        arrayList.add(new Etel(name,amount,price,3));
                    }
                    else
                    {
                        arrayList.add(new Etel(name,amount,price,4));
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nincs ilyen fájl!");
        }

        //7. feladat
        System.out.println("Adj meg egy fájlnevet!");
        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        Date date = new Date();
        Menü menü= new Menü(arrayList,dateFormat.format(date));
        scanner=new Scanner(System.in);
        filePath=scanner.nextLine();
        menü.kiír(filePath);

        //8. feladat
        for (Termek termek : arrayList)
        {
            if ("adag".equals(termek.getAmount()))
            {
                try {
                    menü.töröl(termek);
                } catch (NincsIlyenTermékException e) {
                    System.out.println("Nincs ilyen termék!");
                }
            }
        }
        //9. feladat
        outPrice(arrayList);
    }
}
