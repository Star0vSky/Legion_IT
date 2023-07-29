package homeWork_06;

public class Clerk extends Employee{

    public Clerk(String name, int id, String birthday, String city) {
        super(name, id, birthday, city, Constants.CLERK_TYPE, Constants.CLERC_SALARY);
    }

    public void makingCalls(String name) {
        System.out.println(String.format("Clerk %s is calling to a client", name));
    }

    public void answeringCalls(String name) {
        System.out.println(String.format("Clerk %s is answering an incoming call", name));
    }

}