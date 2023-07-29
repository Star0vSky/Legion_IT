package homeWork_06;

public class Manager extends Employee{

    public Manager(String name, int id, String birthday, String city) {
        super(name, id, birthday, city, Constants.MANAGER_TYPE, Constants.MANAGER_SALARY);
    }

    public void hireEmployee(String name){
        System.out.println(String.format("The employee %s was hired ", name));
    }

    public void fireEmployee(String name){
        System.out.println(String.format("The employee %s was fired ", name));
    }

}
