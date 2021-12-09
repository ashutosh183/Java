class GameOverMethod{
      public static void main(String[] args){
            boolean gameOver = true;
            int score = 2300;
            int levelCompleted = 10;
            calculateScore(gameOver, score, levelCompleted);
            gameOver = true;
            score = 23500;
            levelCompleted = 34;
            calculateScore(gameOver, score, levelCompleted);
      }

      public static void calculateScore(boolean gameOver, int score, int levelCompleted){
            long finalScore = 0;
            if(levelCompleted < 15 && gameOver){
                  finalScore += (score + (levelCompleted * 100));
            }

            finalScore += (score + (levelCompleted * 1000));

            System.out.println(finalScore);
      }
}