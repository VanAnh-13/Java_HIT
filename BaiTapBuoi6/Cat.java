package bai1;

import java.util.Scanner;

public class Cat extends Animal {
	private String color;
	private String preferences;
	private String ownerName;
	public Cat() {
		super();
	}
	
	public Cat(String name, int age, float weight, String color, String preferences, String ownerName) {
		super(name, age, weight);
		this.color = color;
		this.preferences = preferences;
		this.ownerName = ownerName;
	}
	
	public Cat(String color, String preferences, String ownerName) {
		this.color = color;
		this.preferences = preferences;
		this.ownerName = ownerName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPreferences() {
		return preferences;
	}

	public void setPreferences(String preferences) {
		this.preferences = preferences;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public void input() {
		super.input();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Nhap mau cua con meo : ");
		this.color = in.nextLine();
		
		System.out.println("Nhap so thich cua con meo : ");
		this.preferences = in.nextLine();
		
		System.out.println("Nhap ten chu so huu : ");
		this.ownerName = in.nextLine();
	}
	
	public void output() {
		super.output();
		
		System.out.println("Mau con meo : " + getColor());
		System.out.println("So thich cua con meo : " + getPreferences());
		System.out.println("Chu so huu cua con meo la : " + getOwnerName());
	}
	
	public void tiengKeu() {
		super.tiengKeu();
		System.out.println("Meo Meo");
	}
}
