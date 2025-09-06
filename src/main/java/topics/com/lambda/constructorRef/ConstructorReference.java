package topics.com.lambda.constructorRef;

interface ConstructorRefDemo {
    MyClass funct(int n);
}

class MyClass {
    private int val;

    MyClass() {
        System.out.println("default constructor");
        val = 0;
    }
    public MyClass(int val) {
        System.out.println("parameterized constructor");
        this.val = val;
    }

    public MyClass setVal(int val) {
        this.val = val;
        return this;
    }

    public int getVal() {
        return val;
    }
}

public class ConstructorReference {

    public static void main(String[] args) {
        // create a reference to the @ConstructorRefDemo constructor.
        // because func() takes an argument, new refers to the parameterized
        // constructor in ConstructorRefDemo not the default constructor
        ConstructorRefDemo demo = MyClass::new;
        // create an instance of MyClass via the  constructor reference

        MyClass aClass = demo.funct(1000);

        // use the instance of MyClass just created

        System.out.println(aClass.getVal()  );
    }
}
