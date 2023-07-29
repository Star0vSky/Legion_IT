package stringsLesson;

public class SelfTrainingPlural {


    public static void main(String[] args) {

        SelfTrainingPlural pluralOrNot = new SelfTrainingPlural();
        pluralOrNot.getLast("trains");


          }

    public void getLast(String word) {


        if (word.substring(word.length()-1).equals("s")) {

            System.out.println(word + " - the word is plural");}
        else
        {
            System.out.println(word + " - the word is singular");
        }
        }


    }


