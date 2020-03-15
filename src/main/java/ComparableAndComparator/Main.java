package ComparableAndComparator;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

       Integer[] array = {1,2,3,4,5,6,7,8,9,11,10,12,20,14,15,16,17,18,19,13};
        Arrays.sort(array);
        System.out.print(Arrays.toString(array));
        System.out.println();

        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer t1, Integer t2) {
                return -Integer.compare(t1,t2);
            }
        });

        System.out.print(Arrays.toString(array));
    }
}
