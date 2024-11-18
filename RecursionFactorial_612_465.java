public class RecursionFactorial {
    public static int  RecursionFactorial(int num){
        if(num==1){
            return 1;
        }

        int Factorial= num*RecursionFactorial(num-1);
        return Factorial;

    }

    public static void main(String args[]){
        int num=10;

        int ans= RecursionFactorial(num);
        System.out.println(ans);
    }
    
}
