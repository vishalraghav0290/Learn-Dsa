import java.util.*;
public class Testarray {
    public static void main(String args[]){
        int arr[]={1,2,3};
        
        int coun=0;
        int newarr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int total=0;
            
       
        for(int j=i;j<arr.length;j++){
            total+=arr[j];
            //System.out.print(total);
            if(total==3){
                coun++;
            
            }
            
        }
        
        }
        System.out.print(coun);
            /*for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                System.out.print("(" + arr[i] + "," + arr[j] + "," + arr[k] +")");*/
                

               // newarr[i]=arr[i]+arr[j];
                //System.out.println();
                //System.out.print(newarr[i]);
            //}
       // }
    }
       


    }
    

