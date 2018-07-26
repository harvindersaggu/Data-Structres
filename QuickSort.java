package com.saggu.thbs.datastructure;

public class QuickSort {

	static void quickSort(int[] a, int start, int end) {
		if (start >= end)
			return;
		int i = divide(a, start, end);
		quickSort(a, start, i - 1);
		quickSort(a, i + 1, end);
	}

	static int divide(int[] a, int start, int end) {
		int pivot = a[start];
		int p = start + 1;
		int q = end;
		while (p <= q) {
			while (a[p] < pivot)
				p++;
			while (a[q] > pivot)
				q--;
			if (q > p) {
				int temp = a[q];
				a[q] = a[p];
				a[p] = temp;
			}
		}
		a[start] = a[q];
		a[q] = pivot;
		return q;
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int a[] = { 9, 3, 0, 16, 1 };
		int start = 0;
		int end = a.length - 1;

		quickSort(a, start, end);

		printArray(a);
	}
}
