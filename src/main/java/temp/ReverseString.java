package temp;

public class ReverseString {

    public static void reverseUsingStringBuilder(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
    }
    public static void reverseUsingIndexing(String str) {
        String reversed = "";
        for(int i = str.length() ; i > 0; i--) {
            reversed += String.valueOf(reversed.charAt(i));
        }
        System.out.println(reversed);
    }


    public static void main(String[] args) {
        reverseUsingStringBuilder("Jai shree ram");
    }

}
