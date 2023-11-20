package algoritms.ex10;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverseArray(array);
        System.out.println(Arrays.toString(array));

    }

    public static void reverseArray(int[] array) {
        //parcurg jumatate de array
        //schimb elementul de inceput cu cel de la sfarsit
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }
}


