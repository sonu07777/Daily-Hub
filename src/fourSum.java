import java.util.ArrayList;
import java.util.*;

public class fourSum {
    static void main() {
        int target = 0;
        int arr[] = {1,0,-1,0,-2,2};
        HashSet<List<Integer>> var= anotherWay(arr, target);
//        System.out.println("the array is "+ var.toString());
        System.out.println("The var is "+var);
    }

    public static HashSet<List<Integer>> getValue(int[] arrays, int target){
        int n = arrays.length;
        HashSet<List<Integer>> sets = new HashSet<>();
        for (int i =0; i<n ; i++ ){
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = i+1; j < n; j++) {
                List<Integer> indexValue = new ArrayList<>();
                int k = -(arrays[i]+ arrays[j]);
                System.out.println(temp.contains(k));
                if(temp.contains(k)){
                    indexValue.add(arrays[i]);
                    indexValue.add(arrays[j]);
                    indexValue.add(k);
                    sets.add(indexValue);
                }else {
                    temp.add(arrays[j]);
                }
            }
        }

        return sets;
    }

    public static HashSet<List<Integer>>   anotherWay(int[] arr, int target){
        HashSet<List<Integer>> temp = new HashSet<>();
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n-3; i++) {
            int j = i+1;
            int k = n-1;
            if (arr[0] == arr[j] ||  arr[k] == arr[k-1]){
                i = i+1;
                j= i+1;
            }

            while (j < k){
                ArrayList<Integer> arrays = new ArrayList<>();
                int sum = arr[i] + arr[j]+ arr[k];
                if (sum == 0){
                    arrays.add(arr[i]);
                    arrays.add(arr[j]);
                    arrays.add(arr[k]);
                    temp.add(arrays);
                }
                if (sum < 0){
                    j++;
                }
                else {
                    k--;

                }

            }
        }
        return  temp;
    }
}
