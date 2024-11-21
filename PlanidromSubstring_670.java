public class PlanidromSubstring {

    public static void PlanidromSubstring(StringBuilder str){
        String[] arr= new String[50];
        int index=0;
        for(int i=0; i<str.length(); i++){
            for( int j=i+1; j< str.length(); j++){
                if( str.charAt(i)==str.charAt(j)){
                    String sub= str.substring(i,j+1);

                    //check whether it substring is palaindrome or not 

                  if(isPlaindrome(sub)){
                    arr[index++]=sub;
                   

                  }  
                }
            }
        }
        for (int k = 0; k < index; k++) {
            System.out.println(arr[k]);
        }



    }
    public static boolean isPlaindrome(String sub){
        int start = 0;
        int end = sub.length() - 1;

        while (start < end) {
            if (sub.charAt(start) != sub.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
            

    }
         

    

    public static void main(String args[]){
        StringBuilder str = new StringBuilder("abamomgodog");
        PlanidromSubstring(str);
        System.out.println();
    }
}
    

