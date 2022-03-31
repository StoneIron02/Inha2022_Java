package net.stoneiron.java.week5;

class ArrayUtil {

    public static int[] concat(int[] array1, int[] array2) {
        int[] newArray = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            newArray[i + array1.length] = array2[i];
        }
        return newArray;
    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}

public class StaticEx {
    public static void main(String [] args) {
        int [] array1 = {1, 5, 7, 9};
        int [] array2 = {3, 6, -1, 100, 77};
        int [] array3 = ArrayUtil.concat(array1, array2);
        ArrayUtil.print(array3);
    }
}