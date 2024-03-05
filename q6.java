import java.util.*;
public class q6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<5;i++){
            for(int j=1;j<5;j++){
                if(i==1 || i==4)
                {
                    System.out.print("****");
                    break;
                }
                else
                {
                    System.out.print("*  *");
                    break;
                }
            }
            System.out.println();
        }
    }
}