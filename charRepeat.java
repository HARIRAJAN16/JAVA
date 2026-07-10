// aabbbcc = a2b3c2
// abbccc = a1b2c3



import java.util.*;
public class charRepeat{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int count =1;
        for(int i=0;i<a.length();i++){
            if(i<a.length()-1 && a.charAt(i)==a.charAt(i+1)){
                count++;
            }
            else{
                System.out.print(a.charAt(i)+""+count);
                count =1;
            }
        }
    }
}
