/*
&&&&&
&&&&
&&&
&&
&
&&&&&
&&&&&&
&&&&&&&
&&&&&&&&
&&&&&&&&&*/
import java.util.*;
public class smaple{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
           System.out.print("*");
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
                
           }System.out.println();
        }
        for(int i=1;i<n;i++){
            System.out.print("*");
            for(int j=1;j<n+i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}