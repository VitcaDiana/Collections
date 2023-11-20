package algoritms.ex9;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) throws Exception {
        int[] array = {1,2,3,4,5};
        try {
            rotateLeft(array, 7);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        rotateLeft(array,3);
        System.out.println(Arrays.toString(array));


    }
    public static void rotateLeft(int [] array,int n) throws Exception {
        if (n < 0 || n >= array.length) {
            throw new Exception("Valoarea lui n nu este corecta");
        }


        int[] result = new int[array.length];
//parcurgem elementele array-ului
        //calculam noul index pentru fiecare element al array-ului
        for (int i = 0; i < array.length; i++) {
            int newIndex = (i-n + array.length) % array.length;
            result[newIndex] = array[i];

        }
        System.arraycopy(result,0,array,0,array.length);
    }
}
