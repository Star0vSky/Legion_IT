package homeWork_06;

public class Accountant extends Employee {

    public Accountant(String name, int id, String birthday, String city) {
        super(name, id, birthday, city, Constants.ACCOUNTANT_TYPE, Constants.ACCOUNTANT_SALARY);
    }

    public void openAccount(String name) {
        System.out.println(String.format("Accountant %s has opened a new account", name));
    }

    public void closeAccount(String name) {
        System.out.println(String.format("Accountant %s has closed this account", name));
    }

    public void createReport(String name) {
        System.out.println(String.format("Accountant %s has created this report", name));
    }

}
