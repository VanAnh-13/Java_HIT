import java.util.Scanner;

public class Faculty {
    private String name;
    private String date;
    private School truong;

    public Faculty(){
        School truong = new School();
        this.truong = truong;
    }

    public Faculty(String name, String date, School truong){
        this.name = name;
        this.date = date;
        this.truong = truong;
    }

    public Faculty(String name, String date, String Name, String Date){
        this.name = name;
        this.date = date;
        this.truong = new School(Name, Date);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setTruong(School truong) {
        this.truong = truong;
    }

    public School getTruong() {
        return truong;
    }

    public void input(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Faculty name : ");
        this.name = input.nextLine();

        System.out.print("Enter Faculty date : ");
        this.date = input.nextLine();

        System.out.print("Enter School name : ");
        String name = input.nextLine();
        this.truong.setName(name);

        System.out.print("Enter School date : ");
        String date = input.nextLine();
        this.truong.setDate(date);
    }

    public void output(){
        System.out.println("Faculty Name : " + getName());
        System.out.println("Faculty Date : " + getDate());
        System.out.println("School Name : " + truong.getName());
        System.out.println("School Date: " + truong.getDate());
    }
}
