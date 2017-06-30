package menza;

/**
 * Created by Student on 6/28/2017.
 */
public class Etel extends Termek {
    private boolean type;
    public Etel(String name, String amount, int price, boolean type) {
        super(name, amount, price);
        this.type=type;
    }
    public  boolean getType() {
        return type;
    }
}
