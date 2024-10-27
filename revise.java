import java.util.*;

public class revise{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int rev = 0;
        while(x>0){
            int ld = x%10;
            rev=(rev*10) + ld;
            x=x/10;
        }
        System.out.print(rev);
    }
}