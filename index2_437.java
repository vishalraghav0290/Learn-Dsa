// AIM is to check that any same no is present in array or not 
import java.util.*;
    public static void main(String args[]){
        
      int arr[]= {1, 3, 4, 2, 2};
      int end=arr.length-1;
      for(int i=0;i<end;i++){
        for(int j=i+1;j<=end;j++){
            if(arr[i]==arr[j]){
                System.out.println("index where same no is found is " + i  +"to"  +j);
             System.out.println(arr[i]);
            }
        }
      }


    }
}
