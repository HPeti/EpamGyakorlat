package menza;

public class Ital extends Termek {
    private boolean type;
    public Ital(String name, String amount, int price, boolean type) {
        super(name, amount, price);
        this.type=type;
    }

    public boolean getType() {
        return type;
    }
}
