import java.util.Scanner;

public class Hang {
    private String maHang;
    private String tenHang;
    private nhaSanXuat nsx;

    public Hang(){
        nhaSanXuat nsx = new nhaSanXuat();
        this.nsx = nsx;
    }
    public Hang(String maHang, String tenHang, nhaSanXuat nsx){
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.nsx = nsx;
    }

    public Hang(String maHang, String tenHang, String maNSX, String tenNSX, String dcNSX ){
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.nsx = new nhaSanXuat(maNSX, tenNSX, dcNSX);
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setNsx(nhaSanXuat nsx) {
        this.nsx = nsx;
    }

    public nhaSanXuat getNsx() {
        return nsx;
    }

    public void Nhap(){
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập mã hàng hóa : ");
        this.maHang = input.nextLine();

        System.out.print("Nhập tên hàng hóa : ");
        this.tenHang = input.nextLine();

        nsx.Nhap();
    }

    public void Xuat(){
        System.out.println("Mã hàng : " + getMaHang());
        System.out.println("Tên hàng : " + getTenHang());
        nsx.Xuat();
    }
}
