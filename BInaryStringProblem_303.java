public class BInaryStringProblem {
    public static void binaryOneOcuurence(int n , int lastplace , String str ){
        if(n==0){
            System.out.println(str);
            return;
        }
        binaryOneOcuurence(n-1, 0, str+"0");
        if(lastplace==0){
            binaryOneOcuurence(n-1, 1, str+"1");
        }
    }


    public static void main(String args[]){
        binaryOneOcuurence(3, 0, "");
        System.out.println();

    }
    
}
