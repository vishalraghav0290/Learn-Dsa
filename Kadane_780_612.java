import java.util.*;
public class Kadane{
    public static void main(String args[]){
        int arr[]={3,7,9,-4};
        int cs =0;
        int maxsum=0;
        int end=arr.length;
        int prefix=0;
        for(int i=0;i<end;i++){
             if(arr[i]<=0){
              arr[i]=0;
        }else{
            prefix=prefix+arr[i];
        }
        if(maxsum<prefix){
            maxsum=prefix;
        }
        System.out.print(arr[i]);

        }
        System.out.println();
        System.out.println(maxsum);
        
       
    }

}
