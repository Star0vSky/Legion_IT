package lesson_02;

public class Self_Training_01 {
    public static void main(String[] args) {

        Self_Training_01 withinTen = new Self_Training_01();

        withinTen.rangeTemplate(101);
    }

    public void rangeTemplate(int a) {
        if (a >= 90 && a <= 100) {

            System.out.print("( " + a + " )" + " -> " + "true");
            }
        else {
            System.out.println("( " + a + " )" + " -> " + "false");
        }
    }
}
