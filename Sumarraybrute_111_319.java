import java.util.*;
public class Sumarraybrute {
    public static void burteForce(int []arr){
        int start=0;
        int end =arr.length-1;
        //let arr be a[]={1,2,3,4,5,6}
        for(int i =0;i<=end;i++){
           
            for(int j=i+1;j<=end;j++){
               
                for(int k=j+1;k<=end;k++){
                    
                    
                    System.out.print("(" + arr[i] + "," + arr[j] + "," + arr[k] + ")");
                    int max=Integer.MIN_VALUE;
                    int min = arr[i]+arr[j]+arr[k];
                    if(max<min){
                        max=min;
                        System.out.println(max);
                    }
                }
                

            }System.out.println();


        }System.out.println();
    
    }
    public static void main (String args[]){
        int arr[]={1,-2,6,-1,3};
        burteForce(arr);
        System.out.print(arr);
        
    }
    
}
