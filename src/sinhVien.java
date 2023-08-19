import java.util.Scanner;

public class sinhVien {
    private String maSinhVien;
    private String hoTen;
    private float diemToan;
    private float diemLy;
    private float diemHoa;

    public sinhVien() {

    }

    public sinhVien(String maSinhVien, String hoTen, float diemToan, float diemLy, float diemHoa) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void nhap(Scanner input){
        System.out.print("\tNhap Ma Sinh Vien: ");
        this.maSinhVien = input.nextLine();

        System.out.print("\tNhap Ho Va Ten: ");
        this.hoTen = input.nextLine();

        System.out.print("\tNhap Diem Toan: ");
        this.diemToan = input.nextFloat();

        System.out.print("\tNhap Diem Ly: ");
        this.diemLy = input.nextFloat();

        System.out.print("\tNhap Diem Hoa: ");
        this.diemHoa = input.nextFloat();
        input.nextLine();
    }

    public float diemTB(){
        return (getDiemToan() + getDiemLy() + getDiemHoa()) / 3;
    }

    public void xuat(){
        System.out.printf("%-20s%-20s%-20f%-20f%-20f%-20f\n",getMaSinhVien(), getHoTen(), getDiemToan(), getDiemLy(), getDiemHoa(), diemTB());
    }

}
