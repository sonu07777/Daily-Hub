import java.util.Arrays;

public class moveZeros {
    static void main() {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
    }
    public static void moveZeroes(int[] nums) {
        int insert = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[insert];
                nums[insert] = temp;
                insert++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
