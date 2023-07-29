package lesson_05_Hash_Map_Set;

import java.util.ArrayList;

public class HomeWork05_01 {
    public static String daysOfWeek(Integer day) {


        ArrayList<String> days = new ArrayList<String>();

        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");

        if (day == null) {

            System.out.println("It cannot be NULL!!!");
            throw new NullPointerException();

        }

        else if (day < 1) {
            return "The number should be equal or larger than 1";
        }

        else if (day > 7) {
            return "The number should be equal or smaller than 7";
        }

        else {

            return days.get(day - 1);
        }

        }


    }

