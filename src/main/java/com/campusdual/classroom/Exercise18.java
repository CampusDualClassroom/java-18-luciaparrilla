package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Exercise18 {

	public static int[] createAndInitializeArray(int length) {
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = i + 1;
		}
		return array;
	}

	public static void showInlineArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int size = Utils.integer("Choose array length: ");
		int[] myArray = createAndInitializeArray(size);

		System.out.print("Array numbers are: ");
		showInlineArray(myArray);
	}
}
