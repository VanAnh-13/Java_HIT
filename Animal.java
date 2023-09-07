package bai1;

import java.util.Scanner;

public class Animal {
	private String name;
	private int age;
	private float weight;
	
	public Animal() {
		
	}
	
	public Animal(String name, int age, float weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
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

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public void input() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Nhap ten cua dong vat : ");
		this.name = in.nextLine();
		
		System.out.println("Nhap tuoi cua dong vat : ");
		this.age = in.nextInt();
		
		System.out.println("Nhap can nang cua dong vat : ");
		this.weight = in.nextFloat();
	}
	
	public void output() {
		System.out.println("Ten cua dong vat : " + getName());
		System.out.println("Tuoi cua dong vat : " + getAge());
		System.out.println("Can nang cua dong vat : " + getWeight());
	}
	
	public void tiengKeu() {
		System.out.println("Xin chao ! ");
	}
}
