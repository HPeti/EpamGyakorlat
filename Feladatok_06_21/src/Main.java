/**
 * Created by Student on 6/21/2017.
 */
public class Main {
    public static String anagramma(String s1, String s2)
    {
        if(s2.length()<s1.length())
        {
            String csere= s1;
            s1=s2;
            s2=csere;
        }
        char[] szo1=s1.toCharArray();
        char[] szo2=s2.toCharArray();
        for (int i=0; i<szo1.length; i++)
        {
            boolean volt=false;
            for (int j=0; j<szo2.length; j++)
            {
                if(szo1[i]==szo2[j])
                {
                    volt= true;
                }
                if(j== szo2.length-1 && volt==false)
                {
                    return "nem az";
                }
            }
        }
        return "az";
    }
    public static void fibonacci(int szam) {
        int [] sorozat= new int[szam];
        if (szam==1) {
            sorozat[0]=1;
        }else if(szam==2)
        {
            sorozat[0]=1;
            sorozat[1]=2;
        }
        else {
            sorozat[0]=1;
            sorozat[1]=2;
            for (int i = 2; i < szam; i++) {
                sorozat[i]= sorozat[i-1]+sorozat[i-2];
            }
        }
        for (int item : sorozat)
        {
            System.out.print(item+" ");
        }
    }
    public static void megfordit(int[] tomb) {
        int [] reversedArray= new int[tomb.length];
        int reverseIndex= tomb.length-1;
        for (int i=0; i < tomb.length; i++)
        {
            reversedArray[reverseIndex]=tomb[i];
            reverseIndex--;
        }
        System.out.println("Alap \t reversed:");
        for(int i=0;i<tomb.length;i++)
        {
            System.out.println(tomb[i]+"\t"+reversedArray[i]);
        }
    }
    public static void main(String [] args)
    {
        System.out.println("Feladat 1: anagramma");
        String szo1="abc";
        String szo2="abcd";
        System.out.println(szo1+" "+szo2);
        System.out.println(anagramma(szo1,szo2));

        System.out.println("Feladat 2: fibonacci");
        fibonacci(10);
        System.out.print("\n");

        System.out.println("Feladat 3: Megfordítás");
        int [] tomb={0,1,2,3};
        megfordit(tomb);
    }
}
