import java.util.*;
 public class Bestday {
    public static void buySell(int[] arr,int buyday,int sellday){//7, 1, 5, 3, 6,
        int end =arr.length;
        for(int i=0;i<end;i++){
            //to check sell day shoud present after buying day
            if(sellday>buyday){
                if(sellday==i){
                    int price =arr[i];
                    int profit =price-buyday;
                    System.out.print("price of day");
                    System.out.println(price);
                    System.out.print("profit we gain through sell");
                    System.out.println(profit);
                }

            }

        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter buyday");
        int buyday=sc.nextInt();
        System.out.println("sellday");
        int sellday=sc.nextInt();
        int arr[]={7, 1, 5, 3, 6,8};
        buySell( arr,  buyday, sellday);
        System.out.println();


    }    
}
