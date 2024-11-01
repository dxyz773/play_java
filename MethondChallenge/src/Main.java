public class Main {
    public static void main(String[] args) {

        int[] scores = {1500, 1000, 500, 100, 25};
        String[] players = {"Mary","Emma","Maryam","Reem","Anas"};

        for (int i = 0; i < 5; i++){

            displayHighScorePosition(players[i],calculateHighScorePosition(scores[i]));
        }
        long test = (long) (2050L / 1024L);
        System.out.print(test);
    }

    public static int calculateHighScorePosition(int score){
        int result;
        if (score >= 1000){
            result = 1;
        } else if (score >= 500){
            result = 2;
        } else if (score >= 100) {
            result = 3;
        } else {
            result = 4;
        }
        return result;
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        String message = String.format("%s managed to get into position %s on the high score list",playerName,highScorePosition);
        System.out.println(message);
    }
}
