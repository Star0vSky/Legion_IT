package lesson_02;

public class Self_Training_03 {
    public static void main(String[] args) {

        Self_Training_03 biggestNumber = new Self_Training_03();

        biggestNumber.bigTemplate(3, 10, 2);
    }

    public void bigTemplate(int a, int b, int c) {
        if (a > b && a > c) {

            System.out.print(a + " is the biggest number");
        }
        else if (c > a && c > b) {
            System.out.print(c + " is the biggest number");
        }
        else {
            System.out.println(b + " is the biggest number");
        }
    }
}