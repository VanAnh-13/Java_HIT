package bai3;

import java.util.Scanner;

public class HangHoaGiaDung extends HangHoa{
	private String chucNang;

	public HangHoaGiaDung() {
	}

	public HangHoaGiaDung(String maHang, String tenHang, int soLuong, float donGia, VatLieu dsVL, String chucNang) {
		super(maHang, tenHang, soLuong, donGia, dsVL);
		this.chucNang = chucNang;
	}

	public String getChucNang() {
		return chucNang;
	}

	public void setChucNang(String chucNang) {
		this.chucNang = chucNang;
	}

	public void input() {
		super.input();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Nhap chuc nang cua hang hoa : ");
		this.chucNang = in.nextLine();
	}

	public void output() {
		super.output();
		
		System.out.println("Chuc nang : " + getChucNang());
	}
}
