package task_4;

import java.util.ArrayList;

public class Prime {
    private ArrayList<Integer> arrayOfIndexes = new ArrayList<>();
    public ArrayList<Integer> getIndexes(int[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                if (IsPrime(array[i])) {
                    arrayOfIndexes.add(i);
                }
            }
        }
        return arrayOfIndexes;
    }
    public void printIndexes(ArrayList<Integer> list) {
        if (list != null) {
            for (Integer arrayOfIndex : list) {
                System.out.format("%d ", arrayOfIndex);
            }
        }
    }
    private boolean IsPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) return true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
