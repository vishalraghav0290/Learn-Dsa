import java.util.*;
public class Binarysearch{
    public static int binarySearch(int []arr){
        int start =0;
        int key=8;
        int end =arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;// 2,4,6,7,8,9
            if(arr[mid]==key){
                return 1;

            }else{
                if(arr[mid]<key){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={2,4,6,7,8,8,9,5};
        int A= binarySearch(arr);
        if(A==-1){
            System.out.print("no is not present in array");
        }
        else{
            System.out.print(arr[A]);
        }
    }
}