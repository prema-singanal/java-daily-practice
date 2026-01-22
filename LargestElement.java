public class LargestElement {

    public static int findLargestElement(int[] array){
        int largest = array[0];
        for(int i=0 ; i < array.length ; i++){
            if(array[i] > largest){
                largest = array[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        int[] array = {34, 67, 23, 89, 2, 90, 11};
        System.out.println("Largest element in the array is: " + findLargestElement(array));
    }
    
}
