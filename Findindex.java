import java.util.*;
 public class Findindex {
    public static int  indexArray(int[] arr,int key){
        int end=arr.length-1;
        for(int i=0;i<=end;i++){
            if(key==arr[i]){
                return i;
            }
             
        }
        return -1;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the target u need to find out in array");
        int key=sc.nextInt();
        int arr[]={2,3,4,5,6,7};
        int A=indexArray(arr, key);
        System.out.println(A);

    }
    
    
}
