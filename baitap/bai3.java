package baitap;

import java.util.Scanner;

public class bai3 {

	public void input(int arr[], int n) {
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < n; i++) {
			System.out.print("arr[" + i + "] : ");
			arr[i] = input.nextInt();
		}
		
		input.close();
	}

	public void output(int arr[]) {
		for( int index : arr)
			System.out.print(index + " ");
	}

	public void sapXep(int arr[], int n) {
		for (int i = 0; i < n - 1; i++)
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[i]) {
					arr[j] += arr[i];
					arr[i] = arr[j] - arr[i];
					arr[j] -= arr[i];
				}
		
		bai3 obj = new bai3();
		obj.output(arr);
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nhap kich thuoc mang : ");
		int n = input.nextInt();
		int arr[] = new int[n];
		
		bai3 tinh = new bai3();
		tinh.input(arr, n);
		
		tinh.sapXep(arr, n);
		
		input.close();
	}

}
