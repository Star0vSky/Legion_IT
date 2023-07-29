package fileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {

    public static void main(String[] args) {

        String file = "LigeonFile.txt";

        FileManager fileManager = new FileManager();
        fileManager.createFile(file);
        fileManager.writeToFile(file, "In all chaotic beauty lies a wounded work of art.\n" +
                "Beautiful but torn, wreaking havoc on my heart.\n" +
                "Camouflaged by insecurities, blinded by it all.\n" +
                "I love the way you sit there and barely notice me at all.\n");

        fileManager.readFromFile(file);
        fileManager.deleteFile(file);


    }

    public void createFile(String fileName) {
        File file = new File(fileName);

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void writeToFile(String fileName, String text) {

        try {
            FileWriter fileWriter = new FileWriter(fileName);

            fileWriter.write(text);
            fileWriter.close();

        } catch (IOException e) {
//            throw new RuntimeException(e);
            System.out.println("Error. Cannot write...");
            e.printStackTrace();
        }

    }


    public void readFromFile(String fileName) {

        File file = new File(fileName);
        try {
            Scanner scanner = new Scanner(file);

//            while(scanner.hasNextLine()){
//                String row = scanner.nextLine();
//                System.out.println(row);
//            }
//            another way to do it:

            for (int i = 0; scanner.hasNextLine(); i++) {
                String row = scanner.nextLine();
                System.out.println(i + 1 + ". " + row);
//                System.out.println(row);
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void deleteFile(String fileName) {

        File file = new File(fileName);

        if (file.exists()) {
            file.delete();
        }

        }

    }
