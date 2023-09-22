package comparing_collections;

import java.util.Comparator;

public class Coin implements Comparable<Coin> {
    private int nominalValue;
    private int mintYear;

    public Coin(int nominalValue, int mintYear) {
        this.nominalValue = nominalValue;
        this.mintYear = mintYear;
    }

    public int getNominalValue() {
        return nominalValue;
    }

    public void setNominalValue(int nominalValue) {
        this.nominalValue = nominalValue;
    }

    public int getMintYear() {
        return mintYear;
    }

    public void setMintYear(int mintYear) {
        this.mintYear = mintYear;
    }

    @Override
    public int compareTo(Coin anotherCoin) {
        return Integer.compare(nominalValue,anotherCoin.getNominalValue());
    }

    @Override
    public String toString() {
        return "Coin{" +
                "nominalValue=" + nominalValue +
                ", mintYear=" + mintYear +
                '}';
    }
}
