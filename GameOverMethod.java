class GameOverMethod{
      public static void main(String[] args){
            boolean gameOver = true;
            int score = 2300;
            int levelCompleted = 10;
            long value1 = calculateScore(gameOver, score, levelCompleted);
            gameOver = true;
            score = 23500;
            levelCompleted = 34;
            long value2 = calculateScore(gameOver, score, levelCompleted);
            if(value1 < value2)
                  System.out.println(value2);
            else
                  System.out.println(value1);
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