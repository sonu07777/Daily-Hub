public class reverseStrings {
    static void main() {
        String s = "abcde";
        String goal = "abced";
        System.out.println(rotateString(s, goal));
    }

    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String concat = s + s;
        if (concat.contains(goal)) {
            return true;
        } else {

            return false;
        }
    }
}
