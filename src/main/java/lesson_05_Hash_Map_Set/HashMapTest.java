package lesson_05_Hash_Map_Set;

import java.util.HashMap;

public class HashMapTest {

    public void hashMapExamples(){

        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("John", "Toronto");
        hashMap.put("Kate", "Moscow");
        hashMap.put("Moshe", "Tel-Aviv");

        System.out.println(hashMap);

        System.out.println(hashMap.get("Moshe"));

        hashMap.remove("John");
        System.out.println(hashMap.size());
        System.out.println(hashMap);



    }
}

