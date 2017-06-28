package menza;

public class Ital extends Termek {
    private static int type;
    public Ital(String name, String amount, String price, int type) {
        super(name, amount, price);
        this.type=type;
    }

    public static int getType() {
        return type;
    }
}
