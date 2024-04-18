package com.sam.b;

public class InnerClasses {
    class inside {
        String name;

        public inside(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        InnerClasses callName = new InnerClasses();
//        System.out.println(callName.);
        InnerClasses callNameTwo = new InnerClasses();

    }
}
