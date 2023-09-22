package comparing_collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Coin big = new Coin(25,2006);
        Coin medium1 = new Coin(10,2016);
        Coin medium2 = new Coin(10,2001);
        Coin small = new Coin(2,2000);

        List<Coin> coins = new ArrayList<>();
        coins.add(big);
        coins.add(medium1);
        coins.add(medium2);
        coins.add(small);

        Collections.sort(coins);
        System.out.println(coins);

        Collections.sort(coins, new MintYearComparator());
        System.out.println(coins);
        // coins.sort(new MintYearComparator());
        Set<Coin> coinSet = new TreeSet<>();
        coinSet.add(big);
        coinSet.add(medium1);
        coinSet.add(medium2);
        coinSet.add(small);

        System.out.println(coinSet);

        Set<Coin> coinsOrderByYear = new TreeSet<>(new MintYearComparator());
        coinsOrderByYear.addAll(coinSet);
        System.out.println(coinsOrderByYear);

    }
}
