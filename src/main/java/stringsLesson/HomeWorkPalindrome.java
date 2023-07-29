package stringsLesson;

public class HomeWorkPalindrome {



    public static void main(String[] args) {

        HomeWorkPalindrome homeWorkPalindrome = new HomeWorkPalindrome();
        boolean analyze = homeWorkPalindrome.isPalindrome("Racecar");
        System.out.println("The word is Palindrome - " + analyze);


    }
        public boolean isPalindrome(String word) {

            word = word.toLowerCase();

            int length = word.length();

                for (int i = 0; i < (length / 2); i++) {

                if (word.charAt(i) != word.charAt(length - i - 1)) {


                return false;
                }
            }
            return true;
        }
}
