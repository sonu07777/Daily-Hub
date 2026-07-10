import java.util.HashSet;

class containsDuplicate{
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4, 5})); // false
    }
     public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}