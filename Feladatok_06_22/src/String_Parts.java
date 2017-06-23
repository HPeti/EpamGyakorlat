/**
 * Created by Student on 6/23/2017.
 */
public class String_Parts {
    public static void commonPart(String text) {
        String [] tomb=text.split(" ");
        String common= tomb[0];
        for (int i=0; i<tomb.length;i++)
        {
            for (int j=0;j<common.length();j++)
            {
                if (tomb[i].charAt(j)!=common.charAt(j))
                {
                    common=common.substring(0,j-1);
                    break;
                }
            }
        }
        System.out.println("A közös rész: "+common);

    }

}
