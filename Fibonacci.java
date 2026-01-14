public class Fibonacci {
    //printing series
    public static void printFibonacciSeries(int n){
    for(int i = 0 ; i < n ; i++ ){
        System.out.print(fibonacciIterative(i) + " ");
    }
}

    public static int fibonacciIterative(int n) {
     if ( n == 0 || n == 1 ){
         return n;
     }
     int prev = 0;
     int curr = 1;
     for(int i=2 ; i<=n ; i++){
         int next = prev + curr; // next = 0 + 1 = 1
         prev = curr; // prev = 1
         curr = next; // curr = 1
     }
     return curr;
    }
    // Time Complexity : O(n)

    public static int fibonacci(int n) {
        if( n == 0 || n == 1 ){
            return n;
        }
        else{
            return  fibonacci(n-1) + fibonacci(n-2);
        }
    }
    // Time Complexity : O(2^n)
    public static void main(String[] args) {
      printFibonacciSeries(10);
      System.out.println("Fibonacci of 10 is: " + fibonacciIterative(10));
    }


    
}

// What is fibonacci series? - starts with 0 and 1 and each subsequent number is the sum of the previous two numbers.
// Swirl pattern , Golden ratio


// better approach using iteration





