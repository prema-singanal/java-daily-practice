public class Factorial {
    public static long usingLoop(int n){
      long factorial = 1;
       for(int i = 1; i <=n ; i++){
        factorial = factorial * i;
       }
      return factorial;
    }

    public static long factorial(int n){
      if( n == 0 ){
          return 1;
        } else {
           return n * factorial(n - 1);  
      }
    }
    public static void main(String[] args) {
        long factorial = factorial(5);
        System.out.println("Factorial of 5 is: " + factorial);
    } 
}

