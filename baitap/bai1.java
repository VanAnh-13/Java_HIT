package baitap;

import java.util.Scanner;

public class bai1 {
		
	public static void demMang(int arr[], int n) {
		int arr2[] = new int[1000000];
		
		for(int i = 0; i < n; i++)
			if(arr[i] <= 0 || arr[i] > 0)
				arr2[arr[i]]++;
		
		for(int i = 0; i < arr2.length; i++) {
			if(arr2[i] != 0)
				System.out.println("So " + i + " xuat hien " + arr2[i] + " lan");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter size array : ");
		
		int number = input.nextInt();
		
		int arr[] = new int[number];
		
		for(int i = 0; i < number; i++) {
			System.out.print("arr[" + i + "] : ");
			arr[i] = input.nextInt();
		}
		
		demMang(arr, number);
		
		input.close();
	}

}
