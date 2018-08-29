import java.util.Scanner;
import java.lang.NumberFormatException;
class Sahil1322
{
public static void main(String args[])
{
String s1;
String s2;
Scanner s=new Scanner(System.in);
System.out.println("Enter string s1");
s1=s.next();
System.out.println("Enter string s2");
s2=s.next();
int a=Integer.parseInt(s1);
int b=Integer.parseInt(s2);
if (a>b)
{
System.out.println("S1 is  max");
}
else 
{
System.out.println("S2 is  max");
}
}
}