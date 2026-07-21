import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class topK {
    static void main() {
        int[] arr = {1,2,1,2,1,2,3,1,3,2};
        int k = 2;
        int[] result = frequency(arr, k);
        System.out.println(result);
    }

    public static int[] frequency(int[] nums, int k) {
        int[] l = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int index =0;
        while (k > 0) {

            int count = 0;
            int prevKey = 0;
            for (int key : map.keySet()) {
                if ( map.get(key) > count) {
                    count = map.get(key);
                    prevKey = key;
                }
            }

            l[index] = prevKey;   // Store in array
            index++;
            map.remove(prevKey);
            k--;
        }
//        System.out.println(map);
        return l;

    }
}
