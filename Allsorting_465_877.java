//import java.util.*;
public class Allsorting {
    public static void bubbleMethond(int arr[]) {
        //int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                   int  temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }

    public static void selectionSort(int[] arr) {

        //int smallest[]=new int[arr.length];
        for(int i=0;i<arr.length-1;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    smallest=j;
                }
               
            } int temp = arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 3, 2, 1 };
        bubbleMethond(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]);
        selectionSort(arr);
        System.out.println();
    }
}