class ReverseString{
      public static void main(String[] args){
            StringBuilder str = new StringBuilder("AUDI");

            for(int i=0; i<str.length()/2; ++i){
                  int front = i;
                  int back = sb.length() - 1 - i;

                  char frontChar = str.charAt(front);
                  char backChar = str.charAt(back);

                  str.setCharAt(front, backChar);
                  str.setCharAt(back, frontChar);
            }

            System.out.println(str);
      }
}