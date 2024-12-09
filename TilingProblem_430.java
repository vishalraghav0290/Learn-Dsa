public class TilingProblem {
    public static int TilingProblem(int n){
        if(n == 1 || n == 0){
            return 1;
    }
    int fnm1=TilingProblem(n-1);
    int fnm2=TilingProblem(n-2);

    int totalways=fnm1+fnm2;
    return totalways; 
}


    public static void main(String args[]){
        
        System.out.println(TilingProblem(3));
    }
    
}
