import java.util.*;
public class yag{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=5;
        int firstline=1;
        int genwin=1;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");

            }
           
            for(int j=2;j<n-j;j++){
                firstline+=j;
            System.out.print(firstline);
            
            for(int m=j-i;m<=firstline;m++){
                 genwin+=m;
            System.out.print(firstline);
            }
        } 
        System.out.println();
        }
    }
}
