import java.util.ArrayList;

public class productOfArray {
    static void main() {
        int[] arr = {-1,1,0,-3,3};
        System.out.println(productExceptSelf(arr));
    }
    public static int[] productExceptSelf(int[] nums) {

        int leftProduct = 1;
        int n = nums.length;
        int[] answer = new int[n];

        for (int i = 0; i < nums.length; i++) {
            answer[i] = leftProduct;
            leftProduct *=nums[i];
        }

        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return answer;
    }
}
