package homeWork_06;

public class EmployeeMain {

    public static void main(String[] args) {

        Manager manager = new Manager("John White", 1, "18 June 1968", "Toronto");

        Clerk clerk1 = new Clerk("George Brown", 2, "15 May 1977", "Hamilton");
        Clerk clerk2 = new Clerk("Steve Black", 3, "22 April 1983", "Windsor");
        Clerk clerk3 = new Clerk("Graham Greene", 4, "10 July 1989", "Burlington");

        Accountant accountant1 = new Accountant("Paul Grey", 5, "17 January 1989", "Toronto");
        Accountant accountant2 = new Accountant("Ed Silver", 6, "03 August 1989", "Oakville");
        Accountant accountant3 = new Accountant("Garry Blue", 7, "25 February 1989", "Hamilton");
        Accountant accountant4 = new Accountant("Andrew Yellow", 8, "30 April 1989", "Hamilton");
        Accountant accountant5 = new Accountant("Adam Rede", 9, "09 October 1989", "Mississauga");

        System.out.println();
        System.out.println();
        System.out.println(manager);
        System.out.println();
        System.out.println(clerk1);
        System.out.println(clerk2);
        System.out.println(clerk3);
        System.out.println();
        System.out.println(accountant1);
        System.out.println(accountant2);
        System.out.println(accountant3);
        System.out.println(accountant4);
        System.out.println(accountant5);
        System.out.println();
        System.out.println("***********************");
        System.out.println();
        manager.fireEmployee("Steve Black");
        System.out.println();
        clerk1.answeringCalls("George Brown");
        System.out.println();
        accountant3.openAccount("Garry Blue");
        System.out.println();
        accountant3.setName("Garry McBlue");
        System.out.println();
        System.out.println(accountant3);


    }

}
