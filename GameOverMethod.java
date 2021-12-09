class GameOverMethod{
      public static void main(String[] args){
            boolean gameOver = true;
            int score = 2300;
            int levelCompleted = 10;
            long value = calculateScore(gameOver, score, levelCompleted);
            System.out.println(value);
            gameOver = true;
            score = 23500;
            levelCompleted = 34;
            value = calculateScore(gameOver, score, levelCompleted);
            System.out.println(value);
      }

      public static long calculateScore(boolean gameOver, int score, int levelCompleted){
            long finalScore = 0;
            if(levelCompleted < 15 && gameOver){
                  finalScore += (score + (levelCompleted * 100));
            }

            finalScore += (score + (levelCompleted * 1000));

            return finalScore;
      }
}