package topics.com.lambda;

interface Lambda{
    double getValue();
}

interface NumericTest{
    boolean test(int x);
}

interface NumericTest2{
    boolean test(int x,int y);
}

public class LambdaFunctions {
    public static void main(String[] args) {

// !  When a lambda expression occurs in a target type context. an instance of a class is automatically created
//!  that implement the functional interface, with lambda expression defining the behaviour of the abstract method
//!  declared by the functional interface

//? inorder to lambda expression to be used in target type context, the type of the abstract method and the
//? type of the lambda expression must be compatible

       Lambda lambda = ()->Math.floor(Math.random() * 100);

       //* one parameterized lambda
        // odd even test
        NumericTest numericTest = (n) -> n%2 == 0;
        System.out.println(numericTest.test(3));
        System.out.println(numericTest.test(4));

        // +ive and -ive test
        NumericTest numericTest1 = n-> n>=0; // ? true : false;
        System.out.println(numericTest1.test(3));


        System.out.println(lambda.getValue());
    }
}
