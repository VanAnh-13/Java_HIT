public class School {
    private String name;
    private String date;

    public School(){

    }

    public School(String name, String date){
        this.name = name;
        this.date = date;
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
}
