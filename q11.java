import java.util.*;

public class q11{
    public static void bin2dec(int bin){
        int myNum=bin;
        int pow=0;
        int dec=0;
        while(bin>0){
            
        int lastdigi = bin%10;
        dec = dec + (lastdigi * (int)Math.pow(2,pow));
        pow++;
        bin = bin/10;
        }
        System.out.println("dec of " + myNum + " is " +dec);
    }
    public static void main(String args[]){
        bin2dec(1010);
    }
}