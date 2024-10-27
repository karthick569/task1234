package javaprogrammingquestions;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) 
	{
             Scanner sc = new Scanner (System.in);
             System.out.println("Enter the string value");
             String a = sc.next();
             StringBuffer sb = new StringBuffer(a);
             String b = sb.reverse().toString();
             if(a.equals(b))
             {System.out.println("string is a palindrome");}
             else
             {System.out.println("string is not a palindrome");}
	}

}
