import java.util.*;
/*Example:
Input: []
Output: [4, -1, 2, 1], Sum = 6*/
public class index{
    public static void main(String args[]){
        //int arr1[]=new int[50];
        int arr[]={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int end =arr.length-1;
        int minvalue=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<=end;i++){
            for(int j=i+1;j<=end;j++){
                System.out.print("(" + arr[i] +","+arr[j]+")");
                
                 sum=arr[i]+arr[j];
            
            }  
System.out.println();


        }if(minvalue<sum){
            minvalue=sum;
            System.out.print(minvalue);
        
    }
}

}