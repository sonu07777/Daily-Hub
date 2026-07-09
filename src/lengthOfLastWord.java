public class lengthOfLastWord {
    static void main() {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }


    public static int lengthOfLastWord(String s) {
        int result = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i) == ' ' && result <= 0){
                continue;
            }
            if(s.charAt(i) == ' ' && result > 0 ){
                break;
            }
            result++;
        }

        return result;
    }
}
