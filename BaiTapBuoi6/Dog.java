package bai1;

import java.util.Scanner;

public class Dog extends Animal {
	private String character;

	public Dog() {
		super();
	}

	public Dog(String name, int age, float weight, String character) {
		super(name, age, weight);
		this.character = character;
	}
	
	public Dog(String character) {
		this.character = character;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}
	
	public void input() {
		super.input();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Nhap ten con cho : ");
		this.character = in.nextLine();
	}
	
	public void output() {
		super.output();
		
		System.out.println("Ten con cho : " + getCharacter());
	}
	
	public void tiengKeu() {
		super.tiengKeu();
		
		System.out.println("Woof Woof !");
	}
}
