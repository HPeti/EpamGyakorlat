import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Student on 6/27/2017.
 */
public final class Validate {
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    public static final Pattern VALID_PASSWORD_REGEX = Pattern.compile("^(?=.{8,})(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[-_.@&#$*~=/])(?!.*\\s).*$", Pattern.CASE_INSENSITIVE);

    public static boolean verifyEmail(String emailStr){
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }

    public static boolean verifyPassword(String passStr, String passwordVerify){
        Matcher matcher = VALID_PASSWORD_REGEX.matcher(passStr);
        return matcher.find();
    }
    public static boolean verifyName(String name)
    {
        int nameSize = name.split(" ").length;
        return nameSize>1;
    }
    public static boolean verifyAddress(String address)
    {
        int addressSize=address.split(",").length;
        return addressSize==4;
    }
    public static boolean verifyAge(int age)
    {
        return age>0;
    }
}