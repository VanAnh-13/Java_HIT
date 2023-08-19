import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Bai 1 :
            Book books[] = new Book[5];

            for(int i = 0; i < 5; i++){
                System.out.println("Nhap thong tin sach thu " + ( i + 1) + ":");
                books[i] = new Book();
                books[i].input(in);
            }

            System.out.printf("%-25s%-25s%-25s%-25s%-10s\n", "Ma sach : ", "Ten sach : ", "Ten tac gia : ", "Nha xuat ban : ", "Nam xuat ban : ");
            for(int i = 0; i < 5; i++)
                books[i].output();

        // Bai 2 :
            Rectangle tinh = new Rectangle();
            tinh.input(in);

            System.out.println("Chieu dai hinh chu nhat la : " + tinh.getLong());
            System.out.println("Chieu rong hinh chu nhat la : " + tinh.getWidth());

            System.out.println("Hinh chu nhat tren co dang : ");
            tinh.printRectangle();

            System.out.println("Dien tich hinh chu nhat la : " + tinh.getArea());
            System.out.println("Chu vi hinh chu nhat la : " + tinh.getPerimeter());

        // Bai 3 :
            sinhVien students[] = new sinhVien[5];

            for(int i = 0 ; i < 5; i++){
                students[i] = new sinhVien();
                System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + " :");
                students[i].nhap(in);
            }

            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n",
                "Ma Sinh Vien : ", "Ho Va Ten : ", "Diem Toan : ", "Diem Ly", "Diem Hoa", "Diem Trung Binh");

            for(int i = 0; i < 5; i++)
                students[i].xuat();
    }
}