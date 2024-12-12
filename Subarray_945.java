import java.util.*;
public class Subarray {
    public static void subarray(int []arr){
        int start=0;
        int count=0;
        int end=arr.length-1;
        for(int i=0;i<=end;i++){
            for(int j=i;j<=end;j++){
                count++;
                 System.out.print("(" + arr[i] +"," +arr[j] +")");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        int arr[]={2,4,5,6,7,8};
        subarray(arr);
        System.out.println();

    }
}
