// // Method 1 - Basic Addition of Two Numbers 
// import java.util.Scanner;

public class AddTwoNumber {
    public static void main( String[] args){
        int num1 = 5;
        int num2 = 10;
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }

}

// // Method 2 - Seperate static method to add two numbers and create a object to call the method

public class AddTwoNumber{
    public static int add(int a , int b){
        return a + b;
    }
    public static void main(String[] args){

        AddTwoNumber obj = new AddTwoNumber();
        int sum = obj.add(8,9);
        System.out.println("The sum is: " + sum);
    }
}

// // Add n numbers

public class AddTwoNumber{
    public static int addNumbers(int n){
        for( int i = 0; i<= n ; i++){
            n = n + i;
            return n;   
        }
    }
    public static void main(String[] args){
        int n = 5;
        int sum = addNumbers(n);
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
    }
}

// // Notes - Here since we are we are iterating from 0 to n hence the time complexity is O(n)

// // Add n numbers using formula

public class AddTwoNumber{
    public static int usingFormula( int n ){
        return n * ( n + 1) / 2;
    }
    public static void main( STring[] args){
        int n = 5;
        int sum = usingFormula(n);
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);

    }
}

// // here since we are using formula the time complexity is O(1)

// // usng recursion

public class AddTwoNumber{
    public static int usingRecursion( int n){
        // for recursion we have to define base case so that it does not go into infinite loop.
        // here base case is when n is less than or equal to 1
        if( n <= 1){
            return n;
        }
        else {
            return n + usingRecursion(n - 1);
        }
    }

    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value :");
        int n = sc.nextInt();
        int sum = usingRecursion(n);
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
    }
}

// // here the time complexity is O(n) due to recursive calls

// // Sum of Two Numbers Using Command Line Arguments in Java

public class AddTwoNumber {

    public static void main(String[] args){
    if(args.length < 2){
    System.out.println("please pass 2 number in command line");
    }
    else{
     System.out.println("args1 : "+args[0]);
     System.out.println("args2 : "+args[1]);
     System.out.println("Sum of 2 numbers = "+ (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));
    }
    }   
}


// Concepts used:
// 1. What is static method?
// 2. How to create object and call method?
// 3. For loop
// 4. Recursion
// 5. Command Line Arguments
// 6. Input Handling with Scanner
// 7. Time Complexity Analysis
// 8. Type Conversion (String to Integer)



