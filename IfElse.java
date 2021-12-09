import java.util.Scanner;

class IfElse{
      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int score = sc.nextInt();
            if(score > 90 && score <= 100)
            {
                  System.out.println("You have got grade 'O' ");
            }

            else if(score > 80 && score <= 90)
            {
                  System.out.println("You have got grade 'A' ");
            }
            else if(score >= 70 && score <= 80){
                  System.out.println("You have got grade 'B' ");
            }
            else{
                  System.out.println("You are not eligible");
            }
      }
}