package topics.practice.lambda.methodRere;

public interface MethodRefPrac {
    String getTDetails(String s);
}

class Demo {
    public static String getDemo(MethodRefPrac methodRefPrac , String s) {
        return "abc" + s;
    }
}

class PracMain {
    public static void main(String[] args) {

        String vishal = Demo.getDemo((str) -> {
            return str + "abc";
        }, "vishal");

        System.out.println(vishal);
    }
}