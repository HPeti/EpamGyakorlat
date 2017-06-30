package menza;

public class Ital extends Termek {
    private boolean type;
    public Ital(String name, String amount, String price, boolean type) {
        super(name, amount, price);
        this.type=type;
    }

    public boolean getType() {
        return type;
    }
}
