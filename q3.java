import java.util.*;
public class q3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int n=1;
        while(n<11){
            System.out.println(num*n);
            n++;
        }
    }
}