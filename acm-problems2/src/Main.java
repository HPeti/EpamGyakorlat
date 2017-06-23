import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);


        HashMap<String,String> dictionary=new HashMap<>();
        while (true) {
            String s=scanner.nextLine();
            if(s.equals(""))
            {
                break;
            }
            else {
                String[] szoveg = s.split(" ");
                if(szoveg[0]!="") {
                    dictionary.put(szoveg[1], szoveg[0]);
                }
            }
        }

        while (true)
        {
            String input=scanner.nextLine();
            if(!scanner.hasNext())
            {
                input=null;
            }
            if(input.equals(null))
            {
                break;
            }
            else
            {
                System.out.println(dictionary.getOrDefault(input, "eh"));
            }
        }
    }
}