package sorting;

import java.util.Arrays;

public class QuickSort {

    public static int partition(int a[], int low, int hi) {

        int p = a[low];
        int i = low;
        int j = hi;

        while (true) {

            while (p > a[++i])
                if (i == hi)
                    break;
            while (p < a[--j])
                if (j == low)
                    break;
            if (i >= j)
                break;

            int val = a[i];
            a[i] = a[j];
            a[j] = val;
        }
            int val = a[low];
            a[low] = a[j];
            a[j] = val;
            return j;
        }
    

    public static void main(String[] args) {

        int a[] = { 15, 100, 200, 2, 1, 5, 7, 3, 8 };
        sort(a, 0, a.length);
        System.out.println(Arrays.toString(a));

    }

    public static void sort(int a[], int lo, int hi) {
        if (lo < hi) {
            int j = partition(a, lo, hi);
            sort(a, lo, j);
            sort(a, j , hi);
        }
    }

}