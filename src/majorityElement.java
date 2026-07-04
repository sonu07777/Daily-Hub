import java.util.HashMap;

public class majorityElement {
    static void main() {
        int[] nums={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
    int result = 0;
    int majerityCheckValue = nums.length/2;
    HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();

    for (int n : nums){
        map.put(n , map.getOrDefault(n,0)+1);
        if(map.get(n) > majerityCheckValue){
            result = n;
        }
    }


    return  result;
    }
}
