public class SumOfArrays {
    public static int sumOfArrays(int[] array){
        int sum = 0;
        for(int i=0 ; i< array.length ; i++){
            sum = sum + array[i];
        }
        return sum;
    }
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Sum of array elements is: " + sumOfArrays(array));
    }
}
