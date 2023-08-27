import java.util.Scanner;

public class Student {
    private String Name;
    private String Class;
    private double Score;
    private Faculty faculty;

    public Student() {
        Faculty faculty = new Faculty();
        this.faculty = faculty;
    }

    public Student(String Name, String Class, double Score, Faculty faculty) {
        this.Name = Name;
        this.Class = Class;
        this.Score = Score;
        this.faculty = faculty;
    }

    public Student(String Name, String Class, double Score, String name, String date, String Name1, String Date) {
        this.Name = Name;
        this.Class = Class;
        this.Score = Score;
        this.faculty = new Faculty(name, date, Name1, Date);
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setClass(String Class) {
        this.Class = Class;
    }

    public String GetClass() {
        return Class;
    }

    public void setScore(double Score) {
        this.Score = Score;
    }

    public double getScore() {
        return Score;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void input() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter student name : ");
        this.Name = in.nextLine();

        System.out.print("Enter student class : ");
        this.Class = in.nextLine();

        System.out.print("Enter student score : ");
        this.Score = in.nextDouble();
        in.nextLine();

        faculty.input();
    }

    public void output() {
        System.out.println("Student name : " + getName());
        System.out.println("Student class : " + GetClass());
        System.out.println("Student score : " + getScore());
        faculty.output();
    }
}
