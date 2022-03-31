package com.bl.generics;

public class MaximumFloat {
    public static float maximum(Float a, Float b, Float c) {
        float maximum = a;

        if (b.compareTo(maximum) > 0) {
            maximum = b;
        }
        if (c.compareTo(maximum) > 0) {
            maximum = c;
        }
        return maximum;
    }

    public static void main(String[] args) {
        float maximumNumber = MaximumFloat.maximum(25.98f, 70.43f, 15.97f);
        System.out.println("The greater float Value is: " + maximumNumber);
    }
}
