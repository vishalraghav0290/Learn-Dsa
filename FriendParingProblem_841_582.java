public class FriendParingProblem {
    public static int  findPairs(int n ){
        if(n==1 || n==2){
            return n;
        }
        int singleOne=findPairs(n-1);
        int totalways= singleOne+ singleOne*findPairs(n-2);
        return totalways;
    }

    public static void main(String args[]){
        System.out.println(findPairs(3));

    }
    
}
