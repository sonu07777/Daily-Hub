public class Palindrome {
    static void main() {
        int x = 121;
        boolean var = isPalindrome(x);
        System.out.println(var);
    }

    public static boolean isPalindrome(int x) {
        int y ;
        while(x > 0 ){
            y = x % 10;
            x = x/10;
            int z = x;
            System.out.println(y);
            System.out.println(x);
        }

        return  true;
    };
}
