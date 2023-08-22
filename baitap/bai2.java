package baitap;

import java.util.Scanner;

public class bai2 {

	public static void Input(int arr[], int number) {
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < number; i++) {
			System.out.print("arr[" + i + "] : ");
			arr[i] = input.nextInt();
		}
		
		input.close();

	}

	public static void output(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void themPhanTu(int arr[], int number) {

		Scanner input = new Scanner(System.in);

		int vitri;

		do {
			System.out.println("Nhap vi tri can them : ");
			vitri = input.nextInt();
		} while (number < 0);

		System.out.println("Nhap so can them : ");
		int phantu = input.nextInt();

		int arr2[] = new int[number + 1];

		for (int i = 0; i < number; i++)
			arr2[i] = arr[i];

		for (int i = number; i >= vitri; i--)
			arr2[i] = arr2[i - 1];

		arr2[vitri - 1] = phantu;

		arr = arr2;
		number++;

		output(arr, number);
		
		input.close();
	}

	public static void xoaPhanTu(int arr[], int number) {

		Scanner input = new Scanner(System.in);

		int vitri;

		do {
			System.out.println("Nhap vi tri can xoa : ");
			vitri = input.nextInt();
		} while (number < 0);

		for (int i = vitri - 1; i < number - 1; i++)
			arr[i] = arr[i + 1];

		number--;

		output(arr, number);
		
		input.close();
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// them phan tu
		System.out.println("Enter size of array 1 : ");

		int number1 = input.nextInt();

		int arr1[] = new int[number1];

		Input(arr1, number1);

		themPhanTu(arr1, number1);

		// xoa phan tu

		System.out.println("\nEnter size of array 2 : ");

		int number2 = input.nextInt();

		int arr2[] = new int[number2];

		Input(arr2, number2);

		xoaPhanTu(arr2, number2);

		input.close();
	}

}
