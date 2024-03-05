//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

import java.util.*;
public class javabasic{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int sume=0;
        int sumo=0;
        int temp=0;
        while(num>0){
            temp=num%10;
            if(temp%2==0){
                sume=sume+temp;
            }
            else{
                sumo=sumo+temp;
            }
            num=num/10;
        }
        System.out.println("Sum of even digits is: "+sume);
        System.out.println("Sum of odd digits is: "+sumo);


        

    }

}