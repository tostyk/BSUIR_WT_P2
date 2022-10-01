package task_7;

public class Sort {
    public double[] Shell(double[] arr) {
        double[] sortedArr = arr.clone();
        for (int step = sortedArr.length / 2; step > 0; step /= 2) {
            for (int i = step; i < sortedArr.length; i++) {
                for (int j = i - step; (j >= 0) && (sortedArr[j] > sortedArr[j + step]); j -= step) {
                    // swap
                    double temp = sortedArr[j];
                    sortedArr[j] = sortedArr[j + step];
                    sortedArr[j + step] = temp;
                }
            }
        }
        return sortedArr;
    }
}
