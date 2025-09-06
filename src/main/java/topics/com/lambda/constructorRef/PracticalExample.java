package topics.com.lambda.constructorRef;

interface MyFunc<R, T> {
    R getMyFunc(T t);
}

// a simple generic class
class MyClass1<T> {
    private T val;

    public MyClass1() {
    }

    public MyClass1(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }
}

class MyClass2 {
    String str;

    public MyClass2() {
    }

    public MyClass2(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}

public class PracticalExample {
    public static<R, T> R myClassFactory(MyFunc<R , T> cons, T v) {
        return cons.getMyFunc(v);
    }

    public static void main(String[] args) {
        // create a reference of MyClass1 constructor
        // in this case, new refers to the constructor that takes an argument
        MyFunc<MyClass1<Integer> , Integer> myClassIntegerMyFunc = MyClass1::new;
        // create a instance of MyClass1 by use of the factory method
        MyClass1<Integer> myFunc = myClassFactory(myClassIntegerMyFunc , 10001);
        // use the instance of MyClass1 just created
        System.out.println(myFunc.getVal());

        System.out.println("----------------------------------------------------------------");

        // create e different
        MyFunc<MyClass2 , String> myClassIntegerMyFunc2 = MyClass2::new;
        MyClass2 myFunc2 = myClassFactory(myClassIntegerMyFunc2,"This is a string");
        System.out.println(myFunc2.getStr());


    /*
        // create a reference of MyClass1 constructor
        // in this case, new refers to the constructor that takes an argument
        MyFunc<MyClass1 , Integer> myClassIntegerMyFunc = MyClass1::new;
        // create a instance of MyClass1 by use of the factory method
        MyClass1 myFunc = myClassIntegerMyFunc.getMyFunc(1234);
        // use the instance of MyClass1 just created
        System.out.println(myFunc.getVal());

        System.out.println("----------------------------------------------------------------");

        // create e different
        MyFunc<MyClass2 , String> myClassIntegerMyFunc2 = MyClass2::new;
        MyClass2 myFunc2 = myClassIntegerMyFunc2.getMyFunc("This is a string");
        System.out.println(myFunc2.getStr());

     */

    }

}
