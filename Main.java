package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
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
	}
}
