public class TwoSum {
    public static void TwoSumElement(int arr[], int key){
        for(int i=0;i<arr.length; i++){
            int next = i+1;
          if(arr[i]+arr[i+1]==key){
             System.out.println(i + "," + next);
          }

        }

    }
    public static void main(String args[]){
        int arr[]={ 2,1,4,5,7};
        int key =9;
        TwoSumElement(arr, key);
        System.out.println();
    }
}
