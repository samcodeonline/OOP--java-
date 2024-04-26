package com.sam.wrapperClasses;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Wrapper {

    public static void main(String[] args) {
        ArrayList  arr = new ArrayList ();
        arr.add(23);
        arr.add("adam");
        arr.add("raoof is a good programmer");
        arr.add("it's been " + 5 + " months now i am working as a developer at an IT company");
        for (Object k : arr){
            System.out.println(k);
        }
    }
}
