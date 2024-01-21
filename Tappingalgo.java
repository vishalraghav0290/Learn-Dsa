import java.util.*;
public class Tappingalgo {
    public static int rainWater(int[] arr){
    int tappingwater=0;
    int waterlevel=0;
    int barheight;
    
    int end =arr.length-1; 
    int leftmax[]=new int[arr.length];
    leftmax[0]=arr[0];
    for(int k=1;k<=arr.length-1;k++){
         leftmax[k]=arr[k];
         leftmax[k]=Math.max(arr[k],leftmax[k-1]);

    }
    int rightmax[] = new int[arr.length];
    rightmax[arr.length-1]=arr[arr.length-1];
    for(int k=arr.length-2;k>=0;k--){
        rightmax[k]=arr[k];
        rightmax[k]=Math.max(arr[k],rightmax[k+1]);
    }

    for(int i=0;i<=end;i++){
        barheight=arr[i];
        waterlevel=Math.min(leftmax[i],rightmax[i]);
        tappingwater+=(waterlevel-arr[i]);
        
    }
    return tappingwater;
    

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[]={4,2,0,6,3,2,5};
        //rainWater(arr);
        System.out.println(rainWater(arr));
    }
}
