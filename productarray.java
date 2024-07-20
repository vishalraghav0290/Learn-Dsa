import java.util.*;
public class productarray {
    public static void main(String args[]){
        int arr[]={1,2,3,4};//1 to 10
        int end =arr.length-1;
// here we found the prefix product of array not the sum 
        int prefix[]=new int[arr.length];
        int newarr[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<=end;i++){
            prefix[i]=prefix[i-1]*arr[i];
            System.out.println("perfix is :" + prefix[i]);   
        }
        // here we find postfix of array  
        int postfix[]=new int[arr.length];
        postfix[arr.length-1]=arr[end];
        for(int i=end-1;i>=0;i--){
            postfix[i]=postfix[i+1]*arr[i];
            System.out.println("postfix is :" + postfix[i]);
        }
        // here we decalre a new array and store product of postfix and prefix of two array
        int product[]=new int[arr.length];
        product[0]=prefix[0]*postfix[0];
        product[arr.length-1]=prefix[arr.length-1]*postfix[arr.length-1];
        for(int i=1;i<=end-1;i++){
            product[i]=prefix[i-1]*postfix[i+1];
            System.out.println("product is :" + product[i]);

        }
       
    }
}
