package com.sam.a;

import org.w3c.dom.ls.LSOutput;

import java.util.stream.IntStream;

public class Static {
//    static int a = 3;
//    static int b = 34;
//
//    static {
//        System.out.println("hello World");
//    }
//
//    public static void main(String[] args) {
//        Static name = new Static();
//        System.out.println(name.a + "   " + name.b);
//    }

    public static void main(String[] args) {
        int arr[] = new int[5];

        IntStream.range(0, arr.length).forEach(System.out::println);
    }
}
