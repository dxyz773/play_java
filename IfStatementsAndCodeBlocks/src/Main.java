public class Main {
    public static void main(String[] args){

        int game1 = calculateScore(true,
                10_000, 8, 200);
        int game2 = calculateScore(true,
                800, 5, 100);
        System.out.println("Score 1: " + game1 + ", Score 2: " + game2);
   System.out.println(("Calculate Score complete"));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        int finalScore = score;

        if (gameOver){
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;

    }
        return finalScore;
    }
}
