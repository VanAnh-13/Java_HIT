package bai1;
package bai2;
package bai3;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			
		// bai 1
			Cat cat = new Cat();
			cat.input();
			cat.output();
			cat.tiengKeu();
			
			Dog dog = new Dog();
			dog.input();
			dog.output();
			dog.tiengKeu();
			
		// bai 2
			System.out.println("Nhap tong so hoc sinh : ");
			int tongSo = in.nextInt();
			
			ArrayList<Student> listStudent = new ArrayList<Student>();
			
			for(int i = 0; i < tongSo; i++) {
				System.out.println("Nhap thong tin hoc sinh " + (i + 1) + " : ");
				Student student = new Student();
				student.input();
				listStudent.add(student);
			}
			
			for(int i = 0; i < tongSo; i++) {
				System.out.println("Thong tin hoc sinh so " + (i + 1) + " : ");
				listStudent.get(i).output();
			}
			
		// bai 3
			System.out.println("Nhap tong so hang hoa gia dung : ");
			int giaDung = in.nextInt();
			
			ArrayList<HangHoaGiaDung> hangHoagiaDung = new ArrayList<>();
			
			for(int i = 0; i < giaDung; i++) {
				System.out.println("Nhap thong tin hang hoa gia dung thu " + ( i + 1) + " : ");
				
				HangHoaGiaDung hanghoa = new HangHoaGiaDung();
				hanghoa.input();
				hangHoagiaDung.add(hanghoa);
			}
			
			for(int i = 0; i < giaDung; i++) {
				System.out.println("Thong tin hang hoa gia dung thu " + ( i + 1 ) + " la : ");
				hangHoagiaDung.get(i).output();
			}
			
			System.out.println("Nhap tong so hang hoa dien tu : ");
			int dienTu = in.nextInt();
			
			ArrayList<HangHoaDienTu> hangHoadienTu = new ArrayList<>();
			
			for(int i = 0; i < dienTu; i++) {
				System.out.println("Nhap thong tin hang hoa dien tu thu " + ( i + 1) + " : ");
				
				HangHoaDienTu hanghoa = new HangHoaDienTu();
				hanghoa.input();
				hangHoadienTu.add(hanghoa);
			}
			
			for(int i = 0; i < giaDung; i++) {
				System.out.println("Thong tin hang hoa dien tu thu " + ( i + 1 ) + " la : ");
				hangHoadienTu.get(i).output();
			}
	}
}
