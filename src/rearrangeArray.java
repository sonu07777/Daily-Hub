import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rearrangeArray {
    static void main() {
        int[] arr = {3,1,-2,-5,2,-4};

        int[] result = rearrangeArray(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] rearrangeArray(int[] nums) {
        int[] newAry = new int[nums.length];
        int first = 0;
        int neg = 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0 ){
                newAry[first] = nums[i];
                first += 2;
            }else {
                newAry[neg] = nums[i];
                neg += 2;
            }
        }

        return  newAry;
    }
}
