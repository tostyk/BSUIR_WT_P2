package task_7;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] arr = {1,2.5,6.2,6.4,0.7,53,1,2.3};
        Sort sort = new Sort();
        System.out.println("Array:        " + Arrays.toString(arr));
        System.out.println("Sorted array: " + Arrays.toString(sort.Shell(arr)));
    }
}
