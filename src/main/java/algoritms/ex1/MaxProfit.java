package algoritms.ex1;

import java.util.ArrayList;
import java.util.List;

public class MaxProfit {
    public static void main(String[] args) {
        List<Integer> prices = new ArrayList<>();
        prices.add(100);
        prices.add(180);
        prices.add(260);
        prices.add(310);
        prices.add(40);
        prices.add(535);
        prices.add(695);
        int buyDay = 0;
        int sellDay = 0;
        int maxProfit = 0;
        for (int i =0; i< prices.size();i++){
            for (int j = i+1; j< prices.size();j++){
                int profit = prices.get(j)-prices.get(i);
                if(profit > maxProfit){
                    maxProfit = profit;
                    buyDay = i+1;
                    sellDay = j+1;
                }
            }

        }
        System.out.println("Cumpara in ziua "+buyDay+ " la pretul de " +prices.get(buyDay-1)+" si vinde in ziua de "+sellDay+ " la pretul de "+prices.get(sellDay-1)+" adica profit maxim "+ maxProfit );
    }
}
