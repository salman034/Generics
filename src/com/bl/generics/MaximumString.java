package com.bl.generics;

public class MaximumString {
    public static String maximum(String a, String b, String c) {
        String maximum = a;
        if (b.compareTo(maximum) > 0) {
            maximum = b;
        }
        if (c.compareTo(maximum) > 0) {
            maximum = c;
        }
        return maximum;
    }

    public static void main(String[] args) {
        String maximumNumber = MaximumString.maximum("Apple", "Peach", "Banana");
        System.out.println("The maximum string Value is: " + maximumNumber);
    }
}
