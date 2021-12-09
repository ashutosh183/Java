import java.util.Scanner;

class LeapYear{
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int year;
            year = sc.nextInt();

            if(checkLeapYear(year)){
                  System.out.println("It is a leap year");
            }
            else{
                  System.out.println("It is not a leap year");
            }
      }

      public static boolean checkLeapYear(int year){
            if(year % 400 == 0)
                  return true;
            if(year % 100 == 0)
                  return false;

            else if(year % 4 == 0)
                  return true;
            
            return false;
      }
}