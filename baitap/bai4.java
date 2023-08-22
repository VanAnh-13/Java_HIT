package baitap;

import java.util.Scanner;

public class bai4 {

	public static boolean chuoiDoiXung(String chuoi) {

		int l = 0, r = chuoi.length() - 1;

		while (l < r) {
			int trai = chuoi.charAt(l), phai = chuoi.charAt(r);

			if (trai != phai)
				return false;

			l++;
			r--;
		}

		return true;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Nhap chuoi dau vao : ");

		String chuoi = input.nextLine();

		if (chuoiDoiXung(chuoi) == true)
			System.out.println("True");

		else
			System.out.println("False");

		input.close();
	}

}
