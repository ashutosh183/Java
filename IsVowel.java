import java.util.Scanner;

class IsVowel{
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            char ch;
            ch = sc.next().charAt(0);

            switch(ch){
                  case 'a':
                  case 'A':System.out.println("It's vowel 'a' or 'A' ");
                        break;
                  case 'e':
                  case 'E':System.out.println("It's vowel 'e' or 'E' ");
                        break;
                  case 'i':
                  case 'I':System.out.println("It's vowel 'i' or 'I' ");
                        break;
                  
                  case 'o':
                  case 'O':System.out.println("It's vowel 'o' or 'O' ");
                        break;
                  case 'u':
                  case 'U':System.out.println("It's vowel 'u' or 'U' ");
                        break;

                  default: System.out.println("It's not a vowel");
                        break;
            }
      }
}