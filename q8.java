import java.util.*;
public class q8{

    public static int[] swap(int a, int b){
        int temp = a;
        a=b;
        b=temp;
        int[] array = {a,b};
        return array;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Swapped values are: "+swap(a,b)[0]+"  :: "+swap(a,b)[1]);

    }
}