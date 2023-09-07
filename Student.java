package bai2;

import java.util.Scanner;

public class Student extends Person {
	private String id;
	private String Class;
	private String school;
	
	public Student() {
		
	}
	
	public Student(String id, String Class, String school) {
		this.id = id;
		this.Class = Class;
		this.school = school;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getclass() {
		return Class;
	}

	public void setClass(String Class) {
		this.Class = Class;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	public void input() {
		super.input();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Nhap id student : ");
		this.id = in.nextLine();
		
		System.out.println("Nhap class student : ");
		this.Class = in.nextLine();
		
		System.out.println("Nhap school student : ");
		this.school = in.nextLine();
	}
	
	public void output() {
		super.output();
		
		System.out.println("Id : " + getId());
		System.out.println("Class : " + getclass());
		System.out.println("School : " + getSchool());
	}
}
