import java.util.Scanner;
class StringBuilders{
      public static void main(String[] args){
            StringBuilder sb = new StringBuilder("Ashutosh");
            System.out.println(sb);

            //PRINTING CHAR AT INDEX I
            System.out.println(sb.charAt(5));

            //SET CHARACTER AT INDEX I

            sb.setCharAt(5, 'd');
            System.out.println(sb);
            sb.setCharAt(5, 'o');
            System.out.println(sb);
            //SETTING A CHAR AT PARTICULAR INDEX
            sb.insert(0, 'T');
            sb.insert(1, '.');
            System.out.println(sb);

            //DELETING THE EXTRA CHARACTER "T."
            //END INDEX IS EXCLUSIVE
            //THIS WILL DELETE ONLY CHARACTERS FROM INDEX 0 TILL 1.
            sb.delete(0, 2);
            System.out.println(sb);
      }
}