package Utility;

import java.util.Random;

/**
 * Created by Peter_Hegedus2 on 7/13/2017.
 */
public class RandomStringGenerator {
    public static String generate(int length)
    {
        String chars = "abcdefghijklmnopqrstuvxyz1234567890";
        StringBuilder builder = new StringBuilder();
        Random r = new Random();
        while (builder.length() < length) {
            int index = (int) (r.nextFloat() * chars.length());
            builder.append(chars.charAt(index));
        }
        return builder.toString();
    }
}
