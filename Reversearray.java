import java.util.*;
public class Reversearray{
    public static void  rverbarray(int []num){
        int start=0;
        int end =num.length-1;
        while(start < end){
            
                int temp=num[start];
                num[start]=num[end];
                num[end]= temp;
                start++;
                end--;
            
        

        }
       
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num[]={2,4,5,6,7,8};
        rverbarray(num);
            for(int i=0;i<num.length;i++){
                System.out.print(num[i]);
            }
        
    } 
        
    
    
}