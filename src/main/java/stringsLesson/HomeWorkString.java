package stringsLesson;

public class HomeWorkString {


    public static void main(String[] args) {
        HomeWorkString twoStrings = new HomeWorkString();
        twoStrings.compareStrings("rain", "rainbow");

    }

    public void compareStrings(String a, String b) {

        if (a == null || b == null) {
            System.out.println("Cannot compare Strings");
        }

        else if (a.equals(b)) {
            System.out.println("These are two the same words " + "'" + a + "'" + " & " + "'" + b + "'");
        }
        else if (b.contains(a)) {
            System.out.println("Word " + "'" + a + "'" + " is contained within word " + "'" + b + "'");
        }

         else if (a.contains(b)){
                System.out.println("Word " + "'" + b + "'" + " is contained within word " + "'" + a + "'");

        }

        else {
            System.out.println("These are two completely different words "  + "'" + a + "'" + " & " + "'" + b + "'");


        }
    }
}
