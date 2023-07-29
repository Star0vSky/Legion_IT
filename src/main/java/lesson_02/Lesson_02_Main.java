package lesson_02;

public class Lesson_02_Main {
    public static void main(String[] args) {
        String userName = "John Doe";
        int userId = 1;
//        System.out.println("the user name is " + userName);
//        System.out.println("the user ID is " + userId);


        Lesson_02_Main lesson2 = new Lesson_02_Main();
//        lesson2.printUserInfo("John Doe", 1);
        boolean isBonusAvailable = true;
        lesson2.checkScore("John Doe", 1, 40, isBonusAvailable);
        lesson2.checkScore("Mark Smith", 2, 50, isBonusAvailable);
        lesson2.checkScore("Anna Smith", 3, 60, isBonusAvailable);
    }

//        Mетод принимает параметры из предыдущего метода main.

  //  public void printUserInfo(String userName, int userId) {

//        System.out.println("the user name is " + userName);
//        System.out.println("the user ID is " + userId);
 //   }

    public void checkScore(String userName, int userId, int userScore, boolean isBonusAvailable) {
        System.out.println("the user name is " + userName);
        System.out.println("the user ID is " + userId);

        if(userName.equals("John Doe")){
            userScore = userScore + 20;
        }

        if(isBonusAvailable){
            userScore = userScore + 10;
        }

        if(userScore>100 || userScore<0){
            System.out.println("Error");
        }

        else if(userScore>=60){
            System.out.println("Pass!");
        }
        else {
            System.out.println("Fail!");
        }
    }
}


//    Mетод принимает параметры из предыдущего метода main.