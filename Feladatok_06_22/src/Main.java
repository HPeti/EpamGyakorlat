import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Student on 6/22/2017.
 */
public class Main {
    public static String zarojel(String text){
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
                    }
                    else {
                        valasz = "Nem helyes karakter bemenet";
                        break;
                    }
                    if(db<0)
                    {
                        valasz ="Nem helyes";
                        break;
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
    public static void calculator(String kifejezes) {
        List<String> lista = Arrays.asList(kifejezes.split(" "));
        String eredmeny="";
        int muvelet=0;
        for (String item : lista)
        {
            if(!Character.isDigit(item.charAt(0)));
            {
                muvelet++;
            }
        }
            for (String item : lista) {
                int temp=0;
                int index=lista.indexOf(item);
                if (Character.isDigit(item.charAt(0)) && item != null) {

                } else {
                    switch (item) {
                        case "+": {
                            temp=Integer.parseInt(lista.get(index-1))+Integer.parseInt(lista.get(index+1));
                            lista.set(index-1,Integer.toString(temp));
                            lista.set(index,Integer.toString(temp));
                            lista.set(index+1,Integer.toString(temp));
                            break;
                        }
                        case "-": {
                            temp=Integer.parseInt(lista.get(index-1))-Integer.parseInt(lista.get(index+1));
                            lista.set(index-1,Integer.toString(temp));
                            lista.set(index,Integer.toString(temp));
                            lista.set(index+1,Integer.toString(temp));
                            break;
                        }
                        case "*": {
                            temp=Integer.parseInt(lista.get(index-1))*Integer.parseInt(lista.get(index+1));
                            lista.set(index-1,Integer.toString(temp));
                            lista.set(index,Integer.toString(temp));
                            lista.set(index+1,Integer.toString(temp));
                            break;
                        }
                        case "/": {
                            temp=Integer.parseInt(lista.get(index-1))/Integer.parseInt(lista.get(index+1));
                            lista.set(index-1,Integer.toString(temp));
                            lista.set(index,Integer.toString(temp));
                            lista.set(index+1,Integer.toString(temp));
                            break;
                        }
                    }
                }
                muvelet--;
                if(muvelet==0)
                {
                    eredmeny=item;
                }
            }
            for (String item: lista)
            {
                System.out.print(item+" ");
            }
            System.out.println("\n"+eredmeny);
    }
    public static void kozosResz(String [] tomb) {

    }

    public static void main(String [] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Feladat 1: Zárójelek");
        System.out.print("\nAdd meg a zárójeleket: ");
        System.out.println(zarojel(scanner.nextLine()));

        System.out.println("Feladat 2: Számológép");
        System.out.print("\nAdj meg egy aritmetikai kifejezést"); //a sorrendet meg kell valósítani
        calculator(scanner.nextLine());

//        System.out.println("Feladat 3: Közös rész a stringbe");

    }
}
