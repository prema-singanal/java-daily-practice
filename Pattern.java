public class Pattern {
    public static void printSquare(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printNumber(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    public static void printSingleColumn(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printSingleRow(int n) {
        for (int row = 1; row <= 1; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void printHollowSquare(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || col == 1 || col == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printRightAngledTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void print(int n) {
        for(int row = 1 ; row <= n ; row++ ){
            for ( int col = n ; col >= row ; col-- ){
                System.out.print("* ");
            }
            System.out.println();
        }
  
    }


    public static void main(String[] args) {

    }
}
