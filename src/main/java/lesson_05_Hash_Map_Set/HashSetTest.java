package lesson_05_Hash_Map_Set;

import java.util.*;

public class HashSetTest {

    public void hashSetExample(){
        HashSet<String> hashSet = new HashSet<String>();

        hashSet.add("John");
        hashSet.add("Kate");
        hashSet.add("Moshe");

        System.out.println(hashSet);

        List<String> list = new ArrayList<String>(hashSet);
        Collections.sort(list);
        System.out.println(list);


    }
}
