import java.util.*;
public class Subarrayprefix {
    public static void subArray(int[] arr){
        //let a[]={2,3,4,5,6};
        int start=0;
        int end = arr.length-1;
        int newarr[]= new int[end+1]; 
        newarr[0]= arr[0];
        for(int i=0;i<=end;i++){
            //we gonna add current value of i and next value of i and store it in new array.
            for(int j=i+1;j<=end;j++){
                 newarr[1]= arr[i] + arr[j];
                

            }
            
        }
    }

    public static void main(String args[]){
        int arr[]={2,3,4,6};
        subArray(arr);
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
    
}
