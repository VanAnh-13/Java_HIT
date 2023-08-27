import java.util.Scanner;

public class may {
    private String maMay;
    private String tenMay;
    private String tinhTrang;

    public may(){

    }

    public may(String maMay, String tenMay, String tinhTrang){
        this.maMay = maMay;
        this.tenMay = tenMay;
        this.tinhTrang = tinhTrang;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public String getMaMay() {
        return maMay;
    }

    public void setTenMay(String tenMay) {
        this.tenMay = tenMay;
    }

    public String getTenMay() {
        return tenMay;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void nhap(){
        Scanner input = new Scanner(System.in);

        System.out.print("\tNhập mã máy : ");
        this.maMay = input.nextLine();

        System.out.print("\tNhập tên máy : ");
        this.tenMay = input.nextLine();

        System.out.print("\tNhập tình trạng máy : ");
        this.tinhTrang = input.nextLine();
    }

    public void xuat(){
        System.out.println("\tMã máy là : " + getMaMay());
        System.out.println("\tTên máy là : " + getTenMay());
        System.out.println("\tTình trạng máy là : " + getTinhTrang());
    }
}
