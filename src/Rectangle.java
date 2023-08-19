import java.util.Scanner;

public class Rectangle {
    private double Long;
    private double Width;

    public Rectangle() {

    }
    public Rectangle(double Long, double Width) {
        this.Long = Long;
        this.Width = Width;
    }

    public void setLong(double Long) {
        this.Long = Long;
    }

    public double getLong() {
        return Long;
    }

    public void setWidth(double Width) {
        this.Width = Width;
    }

    public double getWidth() {
        return Width;
    }

    public void input(Scanner in) {
        System.out.println("Enter Long : ");
        this.Long = in.nextDouble();

        System.out.println("Enter Width : ");
        this.Width = in.nextDouble();
        in.nextLine();
    }

    public void printRectangle() {
        for (int i = 0; i < Long; i++) {

            System.out.print("*");

            for (int j = 1; j < Width; j++)
                System.out.print("*");

            System.out.print("\n");
        }
    }

    public float getArea() {
        return (float) (Long * Width);
    }

    public float getPerimeter() {
        return (float) (2 * (Long + Width));
    }
}
