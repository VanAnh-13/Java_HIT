import java.util.Scanner;

public class phongMay {
    private String maPhong;
    private String tenPhong;
    private double dienTich;
    private quanLy ql;
    private int soMay;
    private may[] y;

    public phongMay() {
        quanLy ql = new quanLy();
        this.ql = ql;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setY(may[] y) {
        this.y = y;
    }

    public may[] getY() {
        return y;
    }

    public void Nhap() {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập mã phòng máy : ");
        this.maPhong = input.nextLine();

        System.out.print("Nhập tên phòng máy : ");
        this.tenPhong = input.nextLine();

        System.out.print("Nhập diện tích phòng : ");
        this.dienTich = input.nextDouble();
        input.nextLine();

        this.ql.nhap();

        System.out.print("Nhập tổng số máy : ");
        this.soMay = input.nextInt();

        this.y = new may[soMay];

        for (int i = 0; i < soMay; i++) {
            System.out.println("Nhập thông tin máy " + (i + 1) + " : ");
            y[i] = new may();
            y[i].nhap();
        }
    }

    public void Xuat() {
        System.out.println("Mã phòng máy là : " + getMaPhong());

        System.out.println("Tên phòng máy là : " + getTenPhong());

        System.out.println("Diện tích phòng máy là : " + getDienTich());

        ql.xuat();

        for (int i = 0; i < soMay; i++) {
            System.out.println("Thông tin máy thứ " + (i + 1) + " là : ");
            y[i].xuat();
        }
    }
}
