public class ThreeSum {
    public static void ThreeSum(int arr[]){
        int start=0;
        int end = arr.length;
        int mid = start+(end-start)/2;

        for(int i=0; i<arr.length; i++){
            if(mid-i>i && mid+1<arr.length){
             if(arr[i]+arr[mid-i]+arr[mid+i]==0){
                System.out.print(arr[i] + " " + arr[mid-1]+ " " + arr[mid+i]);
             }

             else{
                System.out.print("array has not three sum array=0");
             }
            }

        }

    }

    public static void main(String args[]){
        int arr[]= {-1,0,1,2,-1,-4};
        ThreeSum(arr);
        System.out.println();
    }
}
