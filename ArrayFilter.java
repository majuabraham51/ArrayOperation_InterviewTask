package com.mypkg.controller;

public class ArrayFilter {

	public static void main(String[] args) {
		int[] a = new int[] { 22, 1, 34, 22, 16 };
		int j = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 22) {
				a[i] = a[j];
				a[j] = 1;
				j++;
			} else if (a[i] == 1) {
				j++;
			}
		}
		printArray(a);

	}

	private static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i != a.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println();
	}

}
