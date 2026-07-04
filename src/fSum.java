import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fSum {
    public static void main() {
        int target = 0;
        int[] arr ={1,0,-1,0,-2,2};
        List<List<Integer>> var = new ArrayList<>();
        var = getValue(arr,target);
        System.out.println("var is " + var);
    }
    public  static List<List<Integer>>  getValue(int[] arr , int target){
        List<List<Integer>> temp = new ArrayList<>();

        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n-3; i++) {
            if (i> 0 && arr[i] == arr[i-1]){
                continue;
            }
            for (int j = i+1; j < n-2; j++) {
                int k = j +1;
                int l = n-1;
                if (j > 0 && arr[j] == arr[j-1]){
                    continue;
                }
                while(k<l){
                    int sum = arr[i] + arr[j] +arr[k]+arr[l];
                    if (sum<0){
                        k++;
                    } else if (sum>0) {
                        l--;
                    }
                    else {
                        List<Integer> temp1 = new ArrayList<>();
                        temp1.add(arr[i]);
                        temp1.add(arr[j]);
                        temp1.add(arr[k]);
                        temp1.add(arr[l]);
                        temp.add(temp1);
                        k++;
                        l--;
                        while(k < l && arr[k] == arr[k-1]){
                            k++;
                        }
                        while (k < l && arr[l]== arr[l+1]){
                            l--;
                        }
                    }
                }

            }
        }
        return temp;
    }
}
