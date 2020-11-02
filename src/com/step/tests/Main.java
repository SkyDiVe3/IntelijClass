package com.step.tests;
import com.step.tests.Something;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Something [] one = new Something[5];
        for (int x = 0;x < one.length ; x++){
            one[x] = new Something();
        }
        for (int x = 0;x < one.length ; x++){
            System.out.println(one[x].name);
        }
        System.out.println();
        one = (Something[])resizeArray(one, 10);
        for (int x = 0;x < one.length ; x++){
            one[x] = new Something();
        }
        for (int x = 0;x < one.length ; x++){
            System.out.println(one[x].name);
        }

    }
    private static Object resizeArray (Object oldArray, int newSize) {
        int oldSize = java.lang.reflect.Array.getLength(oldArray);
        Class elementType = oldArray.getClass().getComponentType();
        Object newArray = java.lang.reflect.Array.newInstance(elementType, newSize);
        int preserveLength = Math.min(oldSize, newSize);
        if (preserveLength > 0)
            System.arraycopy(oldArray, 0, newArray, 0, preserveLength);
        return newArray;
    }

}
