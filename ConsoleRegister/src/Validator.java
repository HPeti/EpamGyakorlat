/**
 * Created by Student on 6/27/2017.
 */
public class Validator {
    public static boolean verify(String name, String address, String email, int age, String password, String passwordVerify)
    {
        int nameSize = name.split(" ").length;
        boolean emailCim=email.contains("@") && email.contains(".");
        int addressSize = address.split(",").length;
        return (nameSize>1 && addressSize==4 && age>0 && password.equals(passwordVerify) &&password.length()>=8 );
    }

}
