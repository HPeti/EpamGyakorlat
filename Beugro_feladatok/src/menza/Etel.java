package menza;

/**
 * Created by Student on 6/28/2017.
 */
public class Etel extends Termek {
    private static int type;
    public Etel(String name, String amount, String price, int type) {
        super(name, amount, price);
        this.type=type;
    }
    public static int getType() {
        return type;
    }
}
