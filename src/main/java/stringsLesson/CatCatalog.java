package stringsLesson;

public class CatCatalog {

    public static void main(String[] args) {
        CatCatalog catCatalog = new CatCatalog();
        catCatalog.stringsExamples();
    }

    public void stringsExamples() {
        String txt1 = "dog";
        String txt2 = "catalog";
    //    System.out.println(txt2.contains(txt1));

    //    System.out.println(txt2.replace("cat", txt1));

       // System.out.println(txt1.charAt(0));
       // System.out.println(txt1.charAt(1));
       // System.out.println(txt1.charAt(2));

        System.out.println(txt2.charAt(0));
        System.out.println(txt2.charAt(1));
        System.out.println(txt2.charAt(txt2.length()-1));
    }
}
