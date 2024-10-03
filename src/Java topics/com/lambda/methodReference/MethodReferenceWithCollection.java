package com.lambda.methodReference;

import java.util.ArrayList;
import java.util.Collections;

class MyObj {
    private int num;

    public MyObj(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}

class UseMethodRefInCollection {
    public int compareMO (MyObj a, MyObj b) {
        return a.getNum() - b.getNum();
    }
}

public class MethodReferenceWithCollection {

    public static void main(String[] args) {
        ArrayList<MyObj> list = new ArrayList<>();
        list.add(new MyObj(12));
        list.add(new MyObj(102));
        list.add(new MyObj(13));
        list.add(new MyObj(2));
        list.add(new MyObj(54));

        UseMethodRefInCollection useMethodRefInCollection = new UseMethodRefInCollection();
        MyObj max = Collections.max(list, useMethodRefInCollection::compareMO);
        System.out.println("Maximum value is "+ max.getNum());

    }
}
