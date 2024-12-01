import java.util.*;
public class Trappedwater{
    public static void storeWater(int[] arr){
        int end =arr.length-1;
        //to caluclate leftmax
        int leftmax[]=new int[end];
        int maxleft;
        leftmax[0]=arr[0]; 
        for(int i=1;i<end;i++){
            leftmax[i]=leftmax[i-1]+arr[i];
           

        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[]={0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        storeWater(arr);
        System.out.println();
    }
}