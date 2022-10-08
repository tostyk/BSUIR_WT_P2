package task_5;

public class IncreasingSequence {
    public int findLongest(int[] arr) {
        int maxLength = 0;
        int[] lengthOfSubsequence = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            lengthOfSubsequence[i] = 1;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lengthOfSubsequence[i] < lengthOfSubsequence[j] + 1) {
                    lengthOfSubsequence[i] = lengthOfSubsequence[j] + 1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (maxLength < lengthOfSubsequence[i]) {
                maxLength = lengthOfSubsequence[i];
            }
        }
        return maxLength;
    }
}
