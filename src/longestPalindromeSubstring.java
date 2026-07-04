//public class longestPalindromeSubstring {
//    static void main() {
//        String s = "babad";
//        int flag = 0;
//        for (int i = 0; i < s.length()-1 ; i++) {
//            for (int j = i+1 ; j <s.length()-1 ; j++) {
//                String k = s.substring(i, j);
//                boolean check = checkPalindrome(k);
//                if (check && flag < k.length()){
//                    System.out.println(k);
//                }
//            }
//        }
//
//    }
//
//    public  static  boolean checkPalindrome(String value){
//        int i =0;
//        int j = value.length()-1;
//        while (i <= j){
//            if (value.indexOf(i) == value.indexOf(j)){
//                i++;
//                j++;
//            }else {
//                return false;
//            }
//        }
//        return  true;
//    };
//}

public class longestPalindromeSubstring {

    public static void main(String[] args) {

        String s = "babad";

        int maxLength = 0;
        String answer = "";

        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j <= s.length(); j++) {

                String sub = s.substring(i, j);

                if (checkPalindrome(sub) && sub.length() > maxLength) {
                    maxLength = sub.length();
                    answer = sub;
                }
            }
        }

        System.out.println(answer);
    }

        public static boolean checkPalindrome(String value) {

            int i = 0;
            int j = value.length() - 1;

            while (i < j) {

                if (value.charAt(i) != value.charAt(j)) {
                    return false;
                }

                i++;
                j--;
            }

            return true;
        }
}
