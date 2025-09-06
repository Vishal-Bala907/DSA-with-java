
package topics.com.lambda;

interface BlockLambda{
    String reverse(String s);
}

public class BlockLambdaExpression {
    public static void main(String[] args) {
        BlockLambda bl = (str)->{
            String rev = "";
            int i = str.length();
            for(i = str.length()-1; i>=0; i--){
                rev += str.charAt(i);
            }
            return rev;
        };

        System.out.println(bl.reverse("Vishal bala"));
    }
}
