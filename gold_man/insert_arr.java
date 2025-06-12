package gold_man;
import java.util.*;
public class insert_arr {
public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4}; 
        int[] elements = {5, 6};               
        int[] positions = {2, 4};             

        int n = arr.length;
        int m = elements.length;
        int[] result = new int[n + m];
        int i = 0, j = 0, k = 0; 
        for (int pos = 1; k < result.length; pos++) {
            if (j < m && pos == positions[j]) {
                result[k++] = elements[j++];
            } else {
                result[k++] = arr[i++];
            }
        }
        System.out.println(Arrays.toString(result));
    }

}

