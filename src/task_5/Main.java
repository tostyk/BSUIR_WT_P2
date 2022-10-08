package task_5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {-1, -2, 0, 2, 5, 3, 6, 7, 8, 4, 9, 6, 10};
        IncreasingSequence seq = new IncreasingSequence();
        System.out.println(Arrays.toString(array));
        System.out.println(array.length - seq.findLongest(array));
    }

}