import java.util.*;
public class q7{
    public static int sum(int a, int b){
        return a+b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Sum of "+a+" and "+b+" is: ");
        System.out.print(sum(a,b));

    }
}