package lesson_02;

public class Lesson_02_Assign_02 {
    public static void main(String[] args) {

        Lesson_02_Assign_02 loopsSumm = new Lesson_02_Assign_02();

        loopsSumm.summTemplate(10, 15);
    }
    public void summTemplate(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; sum += i++) {
        }
            System.out.println("Total: " + sum);
        }
    }

