import java.util.Scanner;

public class nhaSanXuat {
    private String maNSX;
    private String tenNSX;
    private String dcNSX;

    public nhaSanXuat(){

    }

    public nhaSanXuat(String maNSX, String tenNSX, String dcNSX){
        this.maNSX = maNSX;
        this.tenNSX = tenNSX;
        this.dcNSX = dcNSX;
    }

    public void setMaNSX(String maNSX) {
        this.maNSX = maNSX;
    }

    public String getMaNSX() {
        return maNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public void setDcNSX(String dcNSX) {
        this.dcNSX = dcNSX;
    }

    public String getDcNSX() {
        return dcNSX;
    }

    public void Nhap(){
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập mã nhà sản xuất : ");
        this.maNSX = input.nextLine();

        System.out.print("Nhập tên nhà sản xuất : ");
        this.tenNSX = input.nextLine();

        System.out.print("Nhập địa chỉ nhà sản xuất : ");
        this.dcNSX = input.nextLine();
    }

    public void Xuat(){
        System.out.println("Mã nhà sản xuất : " + getMaNSX());
        System.out.println("Tên nhà sản xuất : " + getTenNSX());
        System.out.println("Địa chỉ nhà sản xuất : " + getDcNSX());
    }
}
