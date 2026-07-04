public class minimumSizeSubarray {
    static void main() {
        int[] subArray = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(target , subArray));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int maxlength =0;
        for (int i = 0; i < nums.length; i++) {
            int k = 1;
            for (int j = i+1; j <= k; j++) {
                int sum = i+j;
                if (sum == target) {
                    if (maxlength < k) {
                        maxlength = k;
                    }
                }
            }
        }
        return  maxlength;
    }
}
