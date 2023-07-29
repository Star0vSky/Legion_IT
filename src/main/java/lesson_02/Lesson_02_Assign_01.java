package lesson_02;
// Even
// Odd
// Divisible by 3
// Divisible by 2 and 3
public class Lesson_02_Assign_01 {
    public static void main(String[] args) {

        Lesson_02_Assign_01 oddEven = new Lesson_02_Assign_01();

        oddEven.sortNumber(44);
    }
    public void sortNumber(int a) {

        if (a % 2 == 0 && a % 3 == 0) {
            System.out.println("Number: " + a + " is devisible by 2 & 3");
        }
        else if (a % 2 == 0){
            System.out.println("Number: " + a + " is even");
        }
        else if (a % 3 == 0){
            System.out.println("Number: " + a + " is devisible by 3");
        }
        else {
            System.out.println("Number: " + a + " is odd");
        }
    }
}
