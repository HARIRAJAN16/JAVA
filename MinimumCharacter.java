
smallest character in string


import java.util.*;
public class MinimumCharacter
{
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  String a=sc.nextLine();
		  int min =Integer.MAX_VALUE;
		  char c=' ';
		  for(int i=0;i<a.length();i++){
		      char ch=a.charAt(i);
		      int b=ch;
		      if(b<min){
		          min=b;
		          c=ch;
		      }
		  }
		  System.out.print(c);
}
}
