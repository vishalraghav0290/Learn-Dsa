public class FirstOccurence{

    public static void FirstOccurence(int arr[], int index, int key){
        if (index == arr.length-1){
            return;
        }
        if(key == arr[index] ){
            System.out.print(index);
            return;
        }

        FirstOccurence(arr,index+1 , key);
        


    }


    public static void main(String args[]){
        int arr[]={1,6,4,5,6,2,3,9};
        int index=0;
        int key =2 ; 
        FirstOccurence(arr, index,key );
        System.out.println();

    }
}