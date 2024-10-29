public class q9{
  //  List<> list=ArrayList
    public static int primeRange(int n){
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                //System.out.println(i);
                continue;
            }
           System.out.println(i);
        }
        return n;
    }
    public static void main(String args[]){
        System.out.println(primeRange(81));
    }
}

