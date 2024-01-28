//import java.uitl.*;
public  class Bubblesort {
    public static void main(String args[]){
        int arr[]={123,89,67,90,541};
        int temp;
        for(int i=0;i<arr.length;i++){//5

            for (int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                }
                //4
            }
           // System.out.print(arr[]);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +",");
            
    }System.out.println();
    
}
}

