package temp;

public class PalindromeCheck {

    public static boolean checkPalindromeWithStringBuilder(int  num) {
        String number = new StringBuilder(String.valueOf(num)).reverse().toString();
        int reversed = Integer.parseInt(number);
        if(num == reversed) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkPalindromeWithStringBuilder(12321));
        System.out.println(checkPalindromeWithStringBuilder(123));
    }

}
