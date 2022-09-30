package task_4;
public class Main{
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,21,22,23,29};
        Prime prime = new Prime();
        prime.PrintIndexes(prime.GetIndexes(array));
    }
}
