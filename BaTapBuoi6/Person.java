package bai2;

import java.util.Scanner;

public class Person {
	private String name;
	private int age;
	private String address;
	private Date birthDay;
	
	public Person() {
		Date birthDay = new Date();
		this.birthDay = birthDay;
	}
	
	public Person(String name, int age, String address, Date birthDay) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.birthDay = birthDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	
	public void input() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Nhap ten : ");
		this.name = in.nextLine();
		
		System.out.println("Nhap tuoi : ");
		this.age = in.nextInt();
		in.nextLine();
		
		System.out.println("Nhap dia chi : ");
		this.address = in.nextLine();
		
		this.birthDay.input();
	}
	
	public void output() {
		System.out.println("Ten : " + getName());
		System.out.println("Tuoi : " + getAge());
		System.out.println("Dia chi : " + getAddress());
		this.birthDay.output();
	}
}
