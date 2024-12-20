import java.util.*;
public class Missingelement {
    public static void elementMiss(int[] arr){
        int end=arr.length-1;
    
        int maxnum=Integer.MIN_VALUE;
        //to find maximum digiht in array
        /*for(int i=0;i<=end;i++ ){
            if(maxnum<arr[i]){
                maxnum=arr[i];
            }

        }*/
       // to arrange array in ascending order[3, 0, 1, 4, 6, 2]
         int temp;int start=0;
        for(int i=start;i<=end;i++){
        for(int j=1;j<=1;j++){
            if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp; 
                start=j+1;
                
                

            }
            System.out.print(arr[i]);
            System.out.print(arr[j]);
           
        }   
            //here we intilazing k0 to kend in coutnious manner as our i is in ascending order we can check it 
            
        }
        /*for(int k=0;k<arr.length;k++){
                if(arr[i]==arr[k]){
                    System.out.println("elemnt match" + arr[i] + "=" + arr[k]);
                }else{
                    System.out.println("element not present is" + arr[k]);
                }

            }*/
       

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[]={3,0,1,4,6,2};
        elementMiss(arr);
        System.out.println();
    }
    
}
