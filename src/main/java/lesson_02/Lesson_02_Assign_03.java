package lesson_02;

public class Lesson_02_Assign_03 {
    public static void main(String[] args) {

        Lesson_02_Assign_03 loopsPiramid = new Lesson_02_Assign_03();

        loopsPiramid.piramidTemplate(9);
    }

    public void piramidTemplate(int rows) {
        for (int i = rows; i >= 1; i--) {

            for (int j = i; j >= 1; j--) {
//                System.out.print(j + " ");
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
