import java.util.Arrays;

public class dailyTemperatures {
    public static void main(String[] args) {
        int[] arr = {73,74,75,71,69,72,76,73};
        int[] result = dailyTemperatures(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        //Brute force
        int[] ans = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            int k = 0;
            for (int j = i + 1; j < temperatures.length; j++) {
                k++;
                if (temperatures[i] < temperatures[j]) {
                    ans[i] = k;
                    break;
                }
            }
        }

        return ans;

        /*
         int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() &&
                   temperatures[i] > temperatures[stack.peek()]) {

                int prev = stack.pop();
                ans[prev] = i - prev;
            }

            stack.push(i);
        }

        return ans;

         */
    }
}
//1,1,4,2,1,1,0,0