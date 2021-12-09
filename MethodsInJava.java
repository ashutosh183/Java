class MethodsInJava{
      public static void main(String[] args){
            int a = 10, b = 20;

            //LET'S CREATE DIFFERENT METHODS FOR ADD, SUBTRACT, MULTIPLY, DIVIDE, REMAINDER.
            add(a, b);
            subtract(a, b);
            multiply(a, b);
            divide(a, b);
            remainder(a, b);
      }
      public static void add(int a, int b){
            int ans = a + b;
            System.out.println(ans);
      }

      public static void subtract(int a, int b){
            if(b > a)
            {
                  System.out.println(b - a);
            }
            else
            {
                  System.out.println(a - b);
            }
      }

      public static void multiply(int a, int b){
            System.out.println(a * b);
      }
      public static void divide(int a, int b) {
            System.out.println(a / b);
      }
      public static void remainder(int a, int b) {
            System.out.println(a % b);      
      }
}