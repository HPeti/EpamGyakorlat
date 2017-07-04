package com.epam.training.internship.multimap;

import java.util.Scanner;

/**
 * Created by Peter_Hegedus2 on 7/4/2017.
 */
public class Main {
    public static void main(String [] args)
    {
        Scanner scanner= new Scanner(System.in);
        MultiMap<String, Integer> multiMap = new MultiMapClass<String, Integer>();
        int action=0;
        boolean exit=false;
        while (!exit)
        {
            System.out.print("\n1 - Kulcs-érték pár hozzáadása <put>(key, value)");
            System.out.print("\n2 - Érték visszaadása <get>(key)");
            System.out.print("\n3 - Értékek eltávolítása kulcs alapján <remove>(Object key)");
            System.out.print("\n4 - Kulcs-érték eltávolítása <remove>(Key, value)");
            System.out.print("\n5 - Map clear");
            System.out.print("\n6 - Key létezik-e <containsKey>(Key)");
            System.out.print("\n7 - Value létezik-e <containsValue>(Value)");
            System.out.print("\n8 - Map üres-e");
            System.out.print("\n9 - Map mérete");
            System.out.print("\n10 - Map listázása");
            System.out.print("\n0 - Program kilépése");
            System.out.print("\nAdd meg a végrehajtandó parancsot:");
            switch (action=Integer.parseInt(scanner.nextLine()))
            {
                case 1:{
                    System.out.print("\nAdd meg az értéket:");
                    break;
                }
                case 2:{
                    System.out.print("\nAdd meg az értéket:");
                    break;
                }
                case 3:{
                    System.out.print("\nAdd meg az értéket:");
                    break;
                }
                case 4:{
                    System.out.print("\nAdd meg az értéket:");
                    break;
                }
                case 5:{
                    System.out.print("\nA map törölve");
                    multiMap.clear();
                    break;
                }
                case 6:{
                    System.out.print("\nAdd meg az értéket:");
                    break;
                }
                case 7:{
                    System.out.print("\nAdd meg az értéket:");
                    int value=Integer.parseInt(scanner.nextLine());
                    multiMap.containsValue(value);
                    break;
                }
                case 8:{
                    System.out.print("\n"+multiMap.isEmpty());
                    break;
                }
                case 9:{
                    System.out.print("\n"+multiMap.size());
                    break;
                }
                case 0:{
                    exit=true;
                    break;
                }
                default:
                {
                    exit=true;
                    break;
                }



            }
        }




    }
}
