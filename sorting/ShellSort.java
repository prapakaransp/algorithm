package sorting;

import java.util.Arrays;

public class ShellSort {

	public static void main(String str[]) {
		int a[] = { 100, 50, 30, 200 };
		sort(a);
		System.out.println(Arrays.toString(a));
	}

	public static void sort(int a[]) {

		int n = a.length;
		// Find H for for sorting
		int h = 1;
		// follow 3x + 1rule

		if (h < n / 3)
			h = 3 * h + 1;

		while (h >= 1) {

			for (int i = h; i < a.length; i++) {

				for (int j = i; j >= h; j -= h) {
					if (a[i] > a[j - h]) {
						int val = a[i];
						a[i] = a[j - h];
						a[j - h] = val;
					}

				}

			}

			h = h / 3;

		}

	}

}