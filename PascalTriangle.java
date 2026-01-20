public class PascalTriangle {
    public static void printPascalTriangle(int n){
        for( int row = 1 ;  row <= n ; row++){
            int number = 1; // first number in each row is 1 
            for( int col = 1 ; col <= row ; col++ ){
                System.out.print(number + " ");
                number = number * (row - col) / (col); // calculate next number in the row
            }
            System.out.println(); // new line after each row
        }

    }
    
    public static void main(String[] args){
        printPascalTriangle(5);
    }
    
}


// Pascal's Triangle is a triangular array of the binomial coefficients.
// Each number is the sum of the two numbers directly above it.
// eg :  1 --- row 1
//      1 1 -- row 2
//     1 2 1 - row 3
//    1 3 3 1 - row 4

// n = row number

