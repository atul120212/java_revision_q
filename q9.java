import java.util.*;

public class q9{
    public static void primeRange(int n){
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                continue;
            }
            return n;
        }
    }
    public static void main(String args[]){
        System.out.println(primeRange(20));
    }
}
