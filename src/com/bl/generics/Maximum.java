package com.bl.generics;

public class Maximum {
    public static int maximum(Integer a, Integer b, Integer c) {
        int maximum = a;

        if (b.compareTo(maximum) > 0) {
            maximum = b;
        }
        if (c.compareTo(maximum) > 0) {
            maximum = c;
        }
        return maximum;
    }

    public static void main(String[] args) {
        int maximumNumber = Maximum.maximum(25, 70, 15);
        System.out.println("The Greater Value is: " + maximumNumber);
    }
}
