package étterem;

import menza.*;

import javax.sound.midi.Soundbank;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class Menü implements Etlap {
    private String datum;
    ArrayList<Termek> lista = new ArrayList<Termek>();

    public Menü(ArrayList<Termek> lista, String datum) {
        this.lista = lista;
        this.datum = datum;
    }

    public Termek[] backAmount(String amount) {
        ArrayList<Termek> mennyiség = new ArrayList<Termek>();
        for (Termek item : lista) {
            if (item.getAmount().equals(amount)) {
                mennyiség.add(item);
            }
        }
        Termek[] mennyiseg = new Termek[mennyiség.size()];
        return mennyiseg = mennyiség.toArray(mennyiseg);
    }

    @Override
    public void felvesz(Termek termek) {
        if (!lista.contains(termek)) {
            lista.add(termek);
        }
    }

    @Override
    public String toString() {
        return this.datum;
    }

    @Override
    public void töröl(Termek termek) throws NincsIlyenTermékException {
        if (lista.contains(termek)) {
            lista.remove(termek);
        } else {
            throw new NincsIlyenTermékException();
        }
    }

    @Override
    public int termékekSzáma(int fajta) {
        int db = 0;
        for (Termek item : lista) {
            switch (fajta) {
                case 1: {
                    if (item instanceof Etel) {
                        Etel e = (Etel) item;
                        if (e.getType()) {
                            db++;
                        }
                    }
                    break;
                }
                case 2: {
                    if (item instanceof Etel) {
                        Etel e = (Etel) item;
                        if (!e.getType()) {
                            db++;
                        }
                    }
                    break;
                }
                case 3: {
                    if (item instanceof Ital) {
                        Ital e = (Ital) item;
                        if (e.getType()) {
                            db++;
                        }
                    }

                    break;
                }
                case 4: {
                    if (item instanceof Ital) {
                        Ital e = (Ital) item;
                        if (!e.getType()) {
                            db++;
                        }
                    }
                    break;
                }

                default: {
                    throw new IllegalArgumentException();
                }
            }
        }
        return db;
    }

    public String getDatum()
    {
        return datum;
    }
    @Override
    public void kiír(String fájlnév) {
        try {
            BufferedWriter writer = new BufferedWriter((new FileWriter(fájlnév)));
            writer.write(this.toString());
            writer.newLine();
            for (Termek item : lista) {
                writer.write(item.getName() + ", " + item.getAmount() + ", " + item.getPrice() + " Ft");
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
