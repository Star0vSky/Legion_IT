package stringsLesson;

public class SelfTrainingFizzBuzz {
    public static void main(String[] args) {
        SelfTrainingFizzBuzz firstLastLetters = new SelfTrainingFizzBuzz();
        firstLastLetters.addFizzBuzz("fob");
    }

    public void addFizzBuzz(String word) {

        if ((word.substring(word.length()-1).equals("b")) && (word.charAt(0) == 'f')) {

            System.out.println("FizzBuzz");
        }


        else if (word.substring(word.length() - 1).equals("b")) {

            System.out.println("Buzz");
        }


        else if (word.charAt(0) == 'f') {

            System.out.println("Fizz");
        }

        else


        System.out.println(word);

}

}



