
public class subArrays {

    public static void printSubArrays(int numbers[]) {
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int soa = 0;
                System.out.print("[");
                for (int k = start; k <= end; k++) {
                    soa += numbers[k];
                    System.out.print(numbers[k] + " ");

                }
                System.out.print("]");
                System.out.println("sum of array:" + soa);
                ts++;
                System.out.println();

            }
            System.out.println();
        }
        System.out.println("total sub arrays:" + ts);
    }

    public static void main(String[] args) {
        int numbers[] = {3, 5, 2, 7, 8, 33};
        printSubArrays(numbers);
    }
}
