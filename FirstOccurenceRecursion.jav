public class FirstOccurenceRecursion{

    public static void FirstOccurenceRecursion(int arr[], int index, int key){
        if (index == arr.length-1){
            return;
        }
        if(key == FirstOccurenceRecursion(index+1)){
            System.out.print(index);
        }



    }


    public static void main(String args){
        int arr[] ={ 1,2,3,4,7,2};
        int index=0;
        int key =2 ; 
        FirstOccurenceRecursion(int arr[],int index, int key );
        System.out.println();

    }
}