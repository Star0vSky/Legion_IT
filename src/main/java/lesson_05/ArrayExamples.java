package lesson_05;

import java.util.ArrayList;
import java.util.Collections;

//public class ArrayExamples {
//    public void stringsArray() {
//        String[] buttons = {"OK", "Cancel", "LogIn", "SignUp"};
//
////        buttons[2] = "Exit";
//
//        int length = buttons.length;
//
////        System.out.println(buttons [2]);
////        System.out.println("length: "+length);
//
////        for (int i = 0; i<buttons.length; i++){
////            System.out.println(buttons[i]);
////        }
//        for (String button : buttons) {
//            System.out.println(button);
//        }
//
//    }
//
//    public void stringsArrayWithSize() {
//        String[] array = new String[5];
//        array[0] = "OK";
//        array[1] = "Cancel";
//        array[2] = "LogIn";
//        array[3] = "SignUp";
//        array[4] = "Exit";
//
//        System.out.println("length: " + array.length);
//
//    }
//
//
//    public void integerArray() {
//        int[] ids = {12, 3, 5, 8};
//        System.out.println(ids[2]);
//    }
//
////    public void arrayListExample() {
////
////        ArrayList<String> buttons = new ArrayList<String>();
////        buttons.add("-OK-");
////        buttons.add("-Cancel-");
////        buttons.add("-LogIn-");
////        buttons.add("-Exit-");
////
////        for (int i = 0; i < buttons.size(); i++) {
////
////            System.out.println(buttons.get(i));
////        }
//
////        System.out.println(buttons.get(0));
//
////        for (String button : buttons) {
////            System.out.println(button);
////
////        }
//
////        System.out.println("The size of the list: " + buttons.size());
////
////        buttons.add("-SignUp-");
////
////        for (String button : buttons) {
////            System.out.println(button);
////
////        }
////
////        System.out.println("The size of the list: " + buttons.size());
////
////        buttons.remove("-Exit-");
////
////        for (String button : buttons) {
////            System.out.println(button);
////
////        }
////
////        buttons.clear();
////
////        System.out.println("The size of the list: " + buttons.size());
////    }
//
//        public void arrayListSortingExample() {
//
//            ArrayList<Integer> arrayList = new ArrayList<Integer>();
//
//            arrayList.add(123);
//            arrayList.add(1);
//            arrayList.add(23);
//            arrayList.add(98);
//
//            Collections.sort(arrayList);
//
//            for (Integer i: arrayList){
//
//                System.out.println(i);
//            }
//
//        }
//
//    }
public class ArrayExamples {

    public String getDays(int dayNum) {
        ArrayList<String> weekDays = new ArrayList<String>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        return weekDays.get(dayNum);

    }
    }







