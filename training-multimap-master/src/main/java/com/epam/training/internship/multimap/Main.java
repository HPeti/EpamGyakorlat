package com.epam.training.internship.multimap;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MultiMap<String, String> multiMap = new MultiMapClass<String, String>();
        int action = 0;
        boolean exit = false;
        while (!exit) {
            System.out.print("\n1 - Add a key-value <put>(key, value)");
            System.out.print("\n2 - Get value by key <get>(key)");
            System.out.print("\n3 - Remove value(s) by a key<remove>(Object key)");
            System.out.print("\n4 - Remove by key-value <remove>(Key, value)");
            System.out.print("\n5 - Map clear");
            System.out.print("\n6 - Key exists? <containsKey>(Key)");
            System.out.print("\n7 - Value exists <containsValue>(Value)");
            System.out.print("\n8 - Map's isEmpty");
            System.out.print("\n9 - Map's size");
            System.out.print("\nAnyNumber - Exit program");
            System.out.print("\nGive an action's number:");
            try {
                action = Integer.parseInt(scanner.nextLine());
                switch (action) {
                    case 1: {
                        System.out.print("\nKey:");
                        String key=scanner.nextLine();
                        System.out.print("\nValuse:");
                        String value=scanner.nextLine();
                        multiMap.put(key,value);
                        break;
                    }
                    case 2: {
                        System.out.print("\nKey:");
                        String key= scanner.nextLine();
                        multiMap.get(key);
                        break;
                    }
                    case 3: {
                        System.out.print("\nKey:");
                        String key= scanner.nextLine();
                        multiMap.remove(key);
                        break;
                    }
                    case 4: {
                        System.out.print("\nKey:");
                        String key=scanner.nextLine();
                        System.out.print("\nValue:");
                        String value=scanner.nextLine();
                        multiMap.remove(key, value);
                        break;
                    }
                    case 5: {
                        System.out.print("\nMap cleared");
                        multiMap.clear();
                        break;
                    }
                    case 6: {
                        System.out.print("\nKey:");
                        String key= scanner.nextLine();
                        multiMap.containsKey(key);
                        break;
                    }
                    case 7: {
                        System.out.print("\nvalue:");
                        String value = scanner.nextLine();
                        multiMap.containsValue(value);
                        break;
                    }
                    case 8: {
                        System.out.print("\n" + multiMap.isEmpty());
                        break;
                    }
                    case 9: {
                        System.out.print("\n" + multiMap.size());
                        break;
                    }
                    default: {
                        System.out.println("The program is terminated");
                        exit = true;
                        break;
                    }
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Bad input parameter!");
            }
        }
    }
}
