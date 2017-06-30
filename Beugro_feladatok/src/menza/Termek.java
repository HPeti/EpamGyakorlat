package menza;

import org.jetbrains.annotations.NotNull;

import java.lang.*;

/**
 * Created by Student on 6/28/2017.
 */
public abstract class Termek implements java.lang.Comparable<Termek>{
    protected String name;
    protected String amount;
    protected int price;
    public Termek(String name, String amount, int price)
    {
        this.name=name;
        this.amount=amount;
        this.price=price;
    }

    @Override
    public int compareTo(Termek p) {
        if (this.name.compareTo(p.name) == 0) {
            return this.amount.compareTo(p.amount);
        }
        return this.name.compareTo(p.name);
    }

    //    @Override
    public boolean equals(Termek termek1) {
        return this.name.equals(termek1.name) && this.amount.equals(termek1.amount);
    }
    @Override
    public String toString()
    {
       return this.getName()+", "+this.amount+", "+this.getPrice()+" Ft\n";
    }
    public String getName() {
        return name;
    }

    public String getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }

}
