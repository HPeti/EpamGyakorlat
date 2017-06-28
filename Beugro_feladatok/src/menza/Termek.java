package menza;

import org.jetbrains.annotations.NotNull;

import java.lang.*;

/**
 * Created by Student on 6/28/2017.
 */
public abstract class Termek implements java.lang.Comparable<Termek>{
    protected String name;
    protected String amount;
    protected String price;
    public Termek(String name, String amount, String price)
    {
        this.name=name;
        this.amount=amount;
        this.price=price;
    }

    @Override
    public int compareTo(@NotNull Termek o) {
        int eredmeny = 0;
        if (this.name.compareTo(o.name) < 0)
        {
            eredmeny = this.name.compareTo(o.name);
        }
        else if (this.name.compareTo(o.name) == 0)
        {
            if (this.amount.compareTo(o.amount) < 0)
            {
                eredmeny = this.amount.compareTo(o.amount);
            }
            else if (this.amount.compareTo(o.amount) == 0)
            {
                eredmeny = 0;
            }
            else
            {
                eredmeny = this.amount.compareTo(o.amount);
            }
        }
        else
        {
            eredmeny = this.name.compareTo(o.name);
        }
        return eredmeny;
    }

    //    @Override
    public boolean equals(Termek termek1) {
        return this.name.equals(termek1.name) && this.amount.equals(termek1.amount);
    }
    @Override
    public String toString()
    {
       return this.getName()+", "+this.amount+", "+this.getPrice()+" Ft";
    }
    public String getName() {
        return name;
    }

    public String getAmount() {
        return amount;
    }

    public String getPrice() {
        return price;
    }

}
