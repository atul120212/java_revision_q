//Write a program to find the factorialof any number entered by the user.

import java.util.*;
public class q2{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int fact=1;
        while(num>0){
            fact*=num;
            num--;
        }
        System.out.println("Factorial is: "+fact);




    }
}