import java.util.Scanner;

public class Book {
    private String maSach;
    private String tenSach;
    private String tenTacGia;
    private String nhaXuatBan;
    private int namXuatBan;

    public Book() {

    }

    public Book(String maSach, String tenSach, String tenTacGia, String nhaXuatBan, int namXuatBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatBan = namXuatBan;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void input(Scanner in) {

        System.out.print("\tMa sach : ");
        this.maSach = in.nextLine();

        System.out.print("\tTen sach : ");
        this.tenSach = in.nextLine();

        System.out.print("\tTen tac gia : ");
        this.tenTacGia = in.nextLine();

        System.out.print("\tTen nha xuat ban : ");
        this.nhaXuatBan = in.nextLine();

        System.out.print("\tNam xuat ban : ");
        this.namXuatBan = in.nextInt();
        in.nextLine();
    }

    public void output() {
        System.out.printf("%-25s%-25s%-25s%-25s%-10d\n", getMaSach(), getTenSach(), getTenTacGia(), getNhaXuatBan(), getNamXuatBan());
    }
}