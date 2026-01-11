import java.util.Scanner;

// using temp variable

public class SwapTwoNumber {
    
    publci static void swapUsingArithematic( int a , int b ){
        a = a + b ;
        b = a - b;
        a = a - b ;
       System.out.println(" Num1 = " + a + "Num2 =" + b);
    }
    
    public static void swapFunction( int a , int b ){
      int temp = b;
      a = b;
      b = temp;
       System.out.println(" Num1 = " + a + "Num2 =" + b);
    }
  
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter num1 :");
      int a = sc.nextInt();
      System.out.println("Enter num2 :");
      int b = sc.nextInt();
      swapFunction(a,b);
    }
}

// The previous methods only swaps local copies

public class SwapTwoNumber {
    public static void swapUsingArray(int[] nums){
     int temp = nums[0];
     nums[0] = nums[1];
     nums[1] = temp;
    }
  
    public static void main(String[] args){
      int[] nums = new int[2];
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter num1 :");
      nums[0] = sc.nextInt();
      System.out.println("Enter num2 :");
      nums[1] = sc.nextInt();
      swapUsingArray(nums);
      System.out.println(" Num1 = " + nums[0] + "Num2 =" + nums[1]);
    }
}

// Concepts Learnt :

// Pass by value - In Java, primitive data types (like int, float, etc.) are passed by value, meaning that a copy of the variable is made when passed to a method. Therefore, changes made to the parameter inside the method do not affect the original variable.
// Pass by reference - In Java, objects (including arrays) are passed by reference, meaning that a reference (or pointer) to the actual object is passed to the method. Therefore, changes made to the object inside the method do affect the original object.



