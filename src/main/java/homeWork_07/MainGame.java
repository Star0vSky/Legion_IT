package homeWork_07;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainGame {

    public static void main(String[] args) {

        String result2 = "Rugby";

        if (result2 == "Soccer") {
            String result = Game.writeNumOfPlayersPerTeam(Game.GameType.SOCCER);
            String file = result2 + ".txt";
            MainGame mainGame = new MainGame();
            mainGame.createFile(file);

            mainGame.writeToFile(file, result);

            System.out.println("Quantity of players: " + result);

        } else if (result2 == "Hockey") {
            String result = Game.writeNumOfPlayersPerTeam(Game.GameType.HOCKEY);
            String file = result2 + ".txt";
            MainGame mainGame = new MainGame();
            mainGame.createFile(file);

            mainGame.writeToFile(file, result);

            System.out.println("Quantity of players: " + result);

        } else if (result2 == "Rugby") {
            String result = Game.writeNumOfPlayersPerTeam(Game.GameType.RUGBY);
            String file = result2 + ".txt";
            MainGame mainGame = new MainGame();
            mainGame.createFile(file);

            mainGame.writeToFile(file, result);

            System.out.println("Quantity of players: " + result);

        } else {
            System.out.print("Wrong game!");
        }

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
            System.out.println("Error. Cannot write information");

        }

    }


}
