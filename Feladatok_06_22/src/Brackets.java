/**
 * Created by Student on 6/23/2017.
 */
public class Brackets {
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
}
