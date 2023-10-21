package bai3;

import java.util.Scanner;

public class VatLieu {
	private String name;
	private String mauSac;
	private int doCung;
	
	public VatLieu() {
		
	}
	
	public VatLieu(String name, String mauSac, int doCung) {
		this.name = name;
		this.mauSac = mauSac;
		this.doCung = doCung;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMauSac() {
		return mauSac;
	}

	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}

	public int getDoCung() {
		return doCung;
	}

	public void setDoCung(int doCung) {
		this.doCung = doCung;
	}
	
	public void nhap() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Nhap ten vat lieu : ");
		this.name = in.nextLine();
		
		System.out.println("Nhap mau sac cua vat lieu : ");
		this.mauSac = in.nextLine();
		
		System.out.println("Nhap do cung cua vat lieu : ");
		this.doCung = in.nextInt();
		in.nextLine();
	}
	
	public void xuat() {
		System.out.println("Vat lieu : " + getName());
		System.out.println("Mau sac : " + getMauSac());
		System.out.println("Do cung : " + getDoCung());
	}
}
