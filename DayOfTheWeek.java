import java.util.Scanner;

class DayOfTheWeek{
      public static void main(String[] args){
            int dayCount;
            Scanner sc = new Scanner(System.in);

            dayCount = sc.nextInt();

            switch(dayCount){
                  case 0: System.out.println("It's Sunday");
                        break;
                  case 1:System.out.println("It's Monday");
                        break;
                  case 2:System.out.println("It's Tuesday");
                        break;
                  case 3:System.out.println("It's Wednesday");
                        break;
                  case 4:System.out.println("It's Thursday");
                        break;
                  case 5:System.out.println("It's Friday");
                        break;
                  case 6:System.out.println("It's Saturday");
                        break;
                  default:System.out.println("Please enter daycount within 0 - 6");
                        break;
            }
      }
}