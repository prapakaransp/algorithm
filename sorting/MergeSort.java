package sorting;
import java.util.Arrays;

public class MergeSort {

    public static void main(String str[]) {
        int a[] = { 5, 8, 4, 3, 2, 1 };
        int aux[] = new int[a.length];

        sort(a, aux, 0, a.length - 1);
        System.out.println(Arrays.toString(a));

    }

    public static void sort(int a[], int aux[], int lo, int hi) {
        if (lo >= hi)
            return;

        int mid = lo + (hi - lo) / 2;

        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        merge(a, aux, lo, mid, hi);

    }

    public static void merge(int a[], int aux[], int low, int mid, int hi) {
        for (int k = low; k <= hi; k++) {
            aux[k] = a[k];
        }
        int i = low;
        int j = mid + 1;

        for (int k = low; k <= hi; k++) {

            if (i > mid) {
                a[k] = aux[j];
                j++;
            } else if (j > hi) {
                a[k] = aux[i];
                i++;
            } else if (aux[i] < aux[j]) {
                a[k] = aux[i];
                i++;

            } else {
                a[k] = aux[j];
                j++;
            }
        }

    }

}