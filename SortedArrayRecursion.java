public class SortedArrayRecursion{

    public static boolean isSorted(int array[], int index){
        if(index==array.length-1){
            return true;
        }
         if(array[index]>array[index+1]){
            return false;
         }
         else
          return isSorted(array, index+1);
         


    }

    public static void main(String args[]){
        int array[] ={ 1,2,3,4,9};
        int index=0;
        boolean ans =isSorted(array, index);
        System.out.println(ans );

    }
}