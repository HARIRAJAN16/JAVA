An Armstrong number (also called a Narcissistic number) is a number that is equal to the sum of its digits, where each digit is raised to the power of the total number of digits.

153
Number of digits = 3
=1+125+27=153

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String b=Integer.toString(a);
        int out=0;
        int d=a;
        while(d>0){
            int c=d%10;
            out+=Math.pow(c,(b.length()));
            d=d/10;
        }
        if(out==a){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not");
        }
        
    }
}
