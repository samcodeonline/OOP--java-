package com.sam.Problems.Interface.ProblemThree;

import java.sql.SQLOutput;

public class Rectangle implements Resizable {

    @Override
    public void resizeWidth(int width) {
        System.out.println(3);
    }

    @Override
    public void resizeHeight(int height) {
        System.out.println(78);
    }
}
