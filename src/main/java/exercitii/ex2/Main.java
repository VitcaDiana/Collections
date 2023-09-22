package exercitii.ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(2.0);
        list.add(3.0);
        list.add(4.5);
        list.add(5.5);

        List<Double> result =squareNumber(list);
        System.out.println(list);
        System.out.println(result);

    }
    public static List<Double> squareNumber(List<Double> list){
        List<Double> result = new ArrayList<>();
        for (Double number : list ){
            double squareNumber = Math.pow(number,2);
            result.add(squareNumber);
        }
        return result;
    }

}
