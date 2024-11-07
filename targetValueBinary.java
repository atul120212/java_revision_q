
public class targetValueBinary {

    public static int findTragetBinary(int nums[], int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        for (int i = 0; i < nums.length; i++) {
            int mid = (end + start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {2, 1, 6, 3, 8, 5};
        System.out.println("index for key is:" + findTragetBinary(nums, 8));
    }
}
