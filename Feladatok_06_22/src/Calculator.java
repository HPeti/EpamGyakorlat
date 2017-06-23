import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Student on 6/23/2017.
 */
public class Calculator {
    public static void calc(String kifejezes) {
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        ArrayList<String> operations=new ArrayList<String>();
        int operationNumber = 0;
        if(kifejezes.length()==0)
        {
            System.out.println("Nem adtál meg semmit");
        }
        for( int i=0; i<kifejezes.length(); i++ )
        {
            if( kifejezes.charAt(i) == '/'||kifejezes.charAt(i) == '*' || kifejezes.charAt(i) == '-' || kifejezes.charAt(i) == '+' )
            {
                operationNumber++;
                operations.add(Character.toString(kifejezes.charAt(i)));
            }
        }
        for (int i=0;i<operationNumber+1;i++)
        {
            if (!Character.isDigit(kifejezes.toCharArray()[0]))
            {
                System.out.println("Nem müvelet!");
            }
            else
            {
                numbers.add(Integer.parseInt(kifejezes.split("[/*+-]")[i]));
            }
        }
        for(int i=0;i<operations.size();i++)
        {
            if(operations.get(i).equals("/")&& numbers.size()!=1)
            {
                numbers.set(i,numbers.get(i)/numbers.get(i+1));
                numbers.remove(i+1);
                operations.remove(i);
                i--;
            }
            else if(operations.get(i).equals("*")&& numbers.size()!=1)
            {
                numbers.set(i,numbers.get(i)*numbers.get(i+1));
                numbers.remove(i+1);
                operations.remove(i);
                i--;
            }
        }
        for (int i=0;i<kifejezes.length();i++)
        {
            if(numbers.size()==1)
            {
                break;
            }
            if(operations.get(i).equals("-")&& numbers.size()!=1)
            {
                numbers.set(i,numbers.get(i)-numbers.get(i+1));
                numbers.remove(i+1);
                operations.remove(i);
                i--;
            }
            else if(operations.get(i).equals("+")&&numbers.size()!=1)
            {
                numbers.set(i,numbers.get(i)+numbers.get(i+1));
                numbers.remove(i+1);
                operations.remove(i);
                i--;
            }
        }
        if (Character.isDigit(kifejezes.toCharArray()[0]))
        {
            System.out.println("Az eredmény: "+numbers.get(0));
        }
    }
}
