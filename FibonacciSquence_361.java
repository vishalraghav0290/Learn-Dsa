public class FibonacciSquence {

    public static int FibonacciSquence(int num){
        if( num<1){
            return 1;
        }

        int FibonacciNo= (FibonacciSquence(num-1)+ FibonacciSquence(num-2));
         return FibonacciNo;

    }
    public static void main(String args[]){
        int num=6;

        int ans= FibonacciSquence(num);
        System.out.println(ans);
       
    }
    
}
