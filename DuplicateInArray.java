public class DuplicateInArray {
 // works for unsorted array
   public static void findAllDuplicates(int[] array){
      for(int i=0 ; i < array.length ; i++){
        for(int j = i+1 ; j < array.length ; j++){
            if(array[i] == array[j]){
                System.out.println("Duplicate element found: " + array[i]);
            }
        }
 
      }
   }

   // works for sorted array
   public static void removeDuplicates(int[] array) {
       int[] temp = new int[array.length];
       temp[0] = array[0];
       int rd = 0;
       for (int i = 1 ; i < array.length; i++) {
              if (array[i] != temp[rd]) {
                rd++;
                temp[rd] = array[i];
              }
       }

         for (int i = 0; i <= rd; i++) {
              System.out.println(temp[i]);
         }
   }


    public static void main(String[] args){
        int[] array = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        
        findAllDuplicates(array);
        removeDuplicates(array);
    }
    
}


// to remove duplicates you need 2 pointers 1 to track array element and other to track temp array index
