package lesson_05_Hash_Map_Set;

import java.util.HashMap;

public class HomeWork05_02 {

    public String ToyStore(int id) {

        HashMap<Integer, String> toys = new HashMap<Integer, String>();
        toys.put(12, "Batmobile");
        toys.put(45, "Light_Saber");
        toys.put(6, "Wonder_Woman");
        toys.put(201, "Hello_Kitty_Bag");
        toys.put(56, "Junior_QA_Analist_Doll");

        boolean id2 = toys.containsKey(id);

            id2 = false;

        if (id2 = false) {

            System.out.println("No such Toy");
        }
        else {
            id2 = true;
        }

               return toys.get(id);
    }

}


