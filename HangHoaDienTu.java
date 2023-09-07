package bai3;

import java.util.Scanner;

public class HangHoaDienTu extends HangHoa{
	private int thoiGianBaoHanh;
	private int congSuat;
	
	public HangHoaDienTu() {
	}
	
	public HangHoaDienTu(String maHang, String tenHang, int soLuong, float donGia, VatLieu dsVL, int thoiGianBaoHanh, int congSuat) {
		super(maHang, tenHang, soLuong, donGia, dsVL);
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		this.congSuat = congSuat;
	}

	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}

	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	public int getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(int congSuat) {
		this.congSuat = congSuat;
	}

	public void input() {
		super.input();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Nhap thoi gian bao hanh : ");
		this.thoiGianBaoHanh = in.nextInt();
		
		System.out.println("Nhap cong suat : ");
		this.congSuat = in.nextInt();
	}

	public void output() {
		super.output();
		
		System.out.println("Thoi gian bao hanh : " + getThoiGianBaoHanh());
		System.out.println("Cong suat : " + getCongSuat());
	}
	
	
}
