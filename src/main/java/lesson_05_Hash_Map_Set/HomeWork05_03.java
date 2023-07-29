package lesson_05_Hash_Map_Set;

import java.util.*;
import java.util.stream.Collectors;

public class HomeWork05_03 {
    public void namesList() {

        ArrayList<String> names = new ArrayList<String>();

        names.add("Steve");
        names.add("Tim");
        names.add("Lucy");
        names.add("Steve");
        names.add("Pat");
        names.add("Angela");
        names.add("Tom");
        names.add("Tim");
        names.add("Anna");
        names.add("Lucy");


        List<String> noDuplicateNames = names.stream()
                                                .distinct()
                                                .collect(Collectors.toList());

        System.out.println(noDuplicateNames);

        }

    }


