//Name:Danny Chan 
//Created: 6-12-19
//Assignment: 1.3  
import java.util.Scanner;
public class test 
{
	public static void main(String[] args) 
	{
		String greeting = "How do you do";
        System.out.println(greeting + "Seven of Nine.");
        String test = "abcdefg";
        System.out.println(test.length());
        System.out.println(test.charAt(1));
        test = "abcdefg";
        System.out.println(test.substring(3));
        System.out.println("abc\ndef");
        System.out.println("abc\\ndef");
        test = "Hello John";
        test = test.toUpperCase();
        System.out.println(test);

        String s1 = "Hello John";
        String s2 = "hello john"; 
        System.out.println(s1.equals(s2));
        s1 = "Hello John";
        s2 = "Hello john"; 
        System.out.println(s1.equals(s2));
      s1 = "Hello John";
      s2 = "Hello john";
      s1 = s1.toUpperCase();
      s2 = s2.toUpperCase();
      System.out.println(s1.equals(s2));
}
}