package baitap;

import java.util.Scanner;

public class bai5 {
	public static void chuyenDoiChuoi(String chuoi) {
		chuoi = chuoi.toLowerCase();

		chuoi = chuoi.replaceAll("\\s\\s+", " ").trim();

		char chuoi1[] = chuoi.toCharArray();

		for (int i = 0; i < chuoi1.length; i++)
			if (chuoi1[i] == ' ' && chuoi1[i + 1] != ' ')
				chuoi1[i + 1] -= 32;

		chuoi1[0] -= 32;

		for (int i = 0; i < chuoi1.length; i++)
			System.out.print(chuoi1[i]);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nhap dau vao chuoi : ");

		String chuoi = input.nextLine();

		chuyenDoiChuoi(chuoi);

		input.close();
	}
}
