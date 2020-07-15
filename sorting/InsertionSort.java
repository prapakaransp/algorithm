package sorting;

import java.util.Arrays;

public class InsertionSort {
    public int a[] = { 31, 41, 59, 26, 41, 58 };

    public void sort() {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && key > a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }

        System.out.println(Arrays.toString(a));
    }

    public static void main(String ant[]) {
        InsertionSort obj = new InsertionSort();
        obj.sort();
    }

}