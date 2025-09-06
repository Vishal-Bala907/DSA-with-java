package topics.com.lambda.constructorRef;

interface GenericConsRef<T> {
    GenericClass<T> getGenericClass(T val);
}

class GenericClass<T> {
    T val;

    public GenericClass() {
        System.out.println("default constructor");
        val = null;
    }

    public GenericClass(T val) {
        System.out.println("Parameterized constructor");
        this.val = val;
    }

    public T getVal() {
        return val;
    }

    public GenericClass<T> setVal(T val) {
        this.val = val;
        return this;
    }
}

public class ConstructorRefWithGeneric {
    public static void main(String[] args) {
        // default constructor
        GenericConsRef<Integer> integerGenericClass = GenericClass::new;

        GenericClass<Integer> genericClass = integerGenericClass.getGenericClass(20);
        System.out.println(genericClass.getVal());
    }
}
