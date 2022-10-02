package task_8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        double[] sequenceA = {1, 2.4, 5.7, 9.0, 9.1, 11.2};
        double[] sequenceB = {0.6, 1, 3.4, 7.6, 9.0, 12, 13.5};
        System.out.println(Arrays.toString(sequenceA));
        System.out.println(Arrays.toString(sequenceB));
        System.out.println(Arrays.toString(sequence.getInsertIndexes(sequenceA, sequenceB)));
    }
}
