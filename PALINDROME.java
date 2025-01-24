import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value to check: ");
        int a=sc.nextInt();
        int temp =a;
        int rev=0;
        while(temp!=0){
            rev=rev*10+temp%10;
            temp=temp/10;
        }
        if(rev==a){
            System.out.print("PALINDROME Number");
            }
        else{
            System.out.print("NOT PALINDROME");
        }
        
    }
}
