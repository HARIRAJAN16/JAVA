import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value to reverse: ");
        int a=sc.nextInt();
        int rev=0;
        while(a!=0){
            rev=rev*10+a%10;
            a=a/10;
        }
        System.out.println("REVERSED NUMBER: "+rev);
    }
}
