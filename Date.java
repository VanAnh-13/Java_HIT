package bai2;

import java.util.Scanner;

public class Date {
	private int year;
	private int month;
	private int day;
	
	public Date() {
		
	}
	
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	public void input() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Nhap nam : ");
		this.year = in.nextInt();
		
		System.out.println("Nhap thang : ");
		this.month = in.nextInt();
		
		System.out.println("Nhap ngay : ");
		this.day = in.nextInt();
	}
	
	public void output() {
		System.out.println(getDay() + " / " + getMonth() + " / " + getYear());
	}
}
