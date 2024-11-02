//Brute Force method

public class maxSubarraySum {

    public static void maxSubarraySum(int numbers[]) {
        int currSum;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = 0; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("maxsum =" + maxSum);

    }

    public static void main(String[] args) {
        int numbers[] = {3, 5, 2, 7, 8, 13};
        maxSubarraySum(numbers);
    }
}
