import java.util.Scanner;

public class quanLy {
    private String maQuanLy;
    private String hoTen;

    public quanLy(){

    }

    public quanLy(String maQuanLy, String hoTen){
        this.maQuanLy = maQuanLy;
        this.hoTen = hoTen;
    }

    public void setMaQuanLy(String maQuanLy) {
        this.maQuanLy = maQuanLy;
    }

    public String getMaQuanLy() {
        return maQuanLy;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void nhap(){
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập mã quản lý : ");
        this.maQuanLy = input.nextLine();

        System.out.print("Nhập họ và tên quản lý : ");
        this.hoTen = input.nextLine();
    }

    public void xuat(){
        System.out.println("Mã nhà quản lý là : " + getMaQuanLy());
        System.out.println("Họ và tên quản lý là : " + getHoTen());
    }
}
