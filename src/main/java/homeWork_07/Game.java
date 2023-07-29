package homeWork_07;


public class Game {

    enum GameType {

        SOCCER,
        HOCKEY,
        RUGBY,

    }

    public static String writeNumOfPlayersPerTeam(GameType game) {


        String result = "result";



        try {


            switch (game) {
                case SOCCER:

                    result = "11";

                   System.out.println("Game is Soccer");

                    break;

                case HOCKEY:

                    result = "6";


                    System.out.println("Game is Hockey");

                    break;

                case RUGBY:

                    result = "15";


                    System.out.println("Game is rugby");

                    break;

            }


        } catch (Exception err) {
            System.out.println("It is not correct game name.");

        }
        return  result;
    }


}
