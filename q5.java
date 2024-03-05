import java.util.*;
public class q5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char ch='A';
        for(int i=1;i<=5;i++){
            for(int j=i;j>0;j--){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}