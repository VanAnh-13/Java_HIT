package bai3;

import java.util.Scanner;

public class HangHoa {
	private String maHang;
	private String tenHang;
	private float soLuong;
	private float donGia;
	private VatLieu dsVL;
	
	public HangHoa() {
		VatLieu dsVL = new VatLieu();
		this.dsVL = dsVL;
	}
	
	public HangHoa(String maHang, String tenHang, float soLuong, float donGia, VatLieu dsVL) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.dsVL = dsVL;
	}

	public String getMaHang() {
		return maHang;
	}

	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public float getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(float soLuong) {
		this.soLuong = soLuong;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	public VatLieu getDsVL() {
		return dsVL;
	}

	public void setDsVL(VatLieu dsVL) {
		this.dsVL = dsVL;
	}
	
	public void input() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Nhap ma hang hoa : ");
		this.maHang = in.nextLine();
		
		System.out.println("Nhap ten hang hoa : ");
		this.tenHang = in.nextLine();
		
		System.out.println("Nhap so luong hang hoa : ");
		this.soLuong = in.nextFloat();
		in.nextLine();
		
		System.out.println("Nhap don gia : ");
		this.donGia = in.nextFloat();
		in.nextLine();
			
		this.dsVL.nhap();
	}
	
	public void output() {
		System.out.println("Ma hang hoa : " + getMaHang());
		System.out.println("Ten hang hoa : " + getTenHang());
		System.out.println("So luong : " + getSoLuong());
		System.out.println("Don gia : " + getDonGia());
		
		dsVL.xuat();
	}
	
	public float tongTien() {
		return getSoLuong() * getDonGia();
	}
}
