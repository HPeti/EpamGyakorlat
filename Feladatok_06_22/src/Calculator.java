import java.util.Arrays;
import java.util.List;

/**
 * Created by Student on 6/23/2017.
 */
public class Calculator {
    public static void calc(String kifejezes) {
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
}
