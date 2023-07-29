package homeWork_06;

public abstract class Employee {

    private String name;
    private int id;
    private String birthday;
    private String city;

    private String title;
    private double salary;

    public Employee(String name, int id, String birthday, String city, String title, double salary) {

        this.name = name;
        this.id = id;
        this.birthday = birthday;
        this.city = city;
        this.title = title;
        this.salary = salary;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void recieveSalary() {
        System.out.println("The salary was sent to the employee bank account");
    }

    public String toString(){
        String txt = String.format(" Name: %s, Id: %d, Title: %s,  Birthday: %s, Salary %f, City: %s",name, id, title, birthday, salary, city);
        return txt;
    }
}
