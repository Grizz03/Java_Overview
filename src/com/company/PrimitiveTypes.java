package com.company;

public class PrimitiveTypes {

    public static void main(String[] args) {
        // Int -> 32 bits width
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        // can be overflow and underflow if used past max and max value
        System.out.println("Integer Minimum value = " + myMinIntValue);
        System.out.println("Integer Minimum value = " + myMaxIntValue);

        int myMaxIntTest = 2_147_483_647;
        System.out.println(myMaxIntTest);
        // Stays around a certain dimension depends on area of where its located.
        // Byte -> 8 bits width
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Maximum value = " + myMaxByteValue);
        System.out.println("Byte Minimum value = " + myMinByteValue);

        // Short -> 16 bits width
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Maximum value = " + myMaxShortValue);
        System.out.println("Short Minimum value = " + myMinShortValue);

        // Long ->
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Maximum value = " + myMaxLongValue);
        System.out.println("Long Minimum value = " + myMinLongValue);

        // Casting ->
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);
    }
}
