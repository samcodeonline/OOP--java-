package com.sam.a;

import org.w3c.dom.ls.LSOutput;

public class Static {
    static int a = 3;
    static int b = 34;

    static {
        System.out.println("hello World");
    }

    public static void main(String[] args) {
        Static name = new Static();
        System.out.println(name.a + "   " + name.b);
    }
}
