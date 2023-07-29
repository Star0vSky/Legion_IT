package stringsLesson;

public class SelfTrainingAddLetters {

    public static void main(String[] args) {
        SelfTrainingAddLetters addLetters = new SelfTrainingAddLetters();
        addLetters.twoLetters("dog");
    }

    public void twoLetters(String word) {
        if (word == null || word.isEmpty() || word.isBlank()) {
            System.out.println("the String is null or empty");
        }
            else {

            System.out.println(String.format("The input string is %s", word));
            String result = "";

            int lastLetter = word.length() - 1;
            result = result + word.charAt(lastLetter);

            System.out.println(result + word + result);
        }
    }
}





