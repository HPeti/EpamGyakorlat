package teszt;

import menza.Etel;
import menza.Ital;
import menza.NincsIlyenTermékException;
import menza.Termek;
import étterem.Menü;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MenüTeszt {
    private static void ebedE(Menü [] menüs)
    {
         for (Menü item : menüs)
         {
             boolean leves=false;
             boolean főétel= false;
             boolean italMentes= false;
             if (item.termékekSzáma(1)>0)
             {
                 leves =true;
             }
             if (item.termékekSzáma(2)>0)
             {
                 főétel=true;
             }
             if (item.termékekSzáma(4)>0)
             {
                 italMentes=true;
             }
             if (leves&& főétel&& italMentes)
             {
                 System.out.println(item.toString());
             }
         }

    }
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
        Scanner scanner=null;
        ArrayList<Termek> arrayList= new ArrayList<>();
        try {
            scanner = new Scanner(new File(args[0]));
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
                        arrayList.add(new Etel(name,amount,price,true));
                    }
                    else
                    {
                        arrayList.add(new Etel(name,amount,price,false));
                    }
                }
                else
                {
                    if ("alkoholos".equals(scanner.next()))
                    {
                        arrayList.add(new Ital(name,amount,price,true));
                    }
                    else
                    {
                        arrayList.add(new Ital(name,amount,price,false));
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
        Menü menuTEST= new Menü(arrayList,dateFormat.format(date));
        scanner=new Scanner(System.in);
        String filePath=scanner.nextLine();
        menuTEST.kiír(filePath);

        //8. feladat
        for (Termek termek : arrayList)
        {
            if ("adag".equals(termek.getAmount()))
            {
                try {
                    menuTEST.töröl(termek);
                } catch (NincsIlyenTermékException e) {
                    System.out.println("Nincs ilyen termék!");
                }
            }
        }
        //9. feladat
        outPrice(arrayList);
        //10. feladat
        Menü [] menüs={menuTEST};
        ebedE(menüs);

    }
}
