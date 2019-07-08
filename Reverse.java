# REVERSE-A-STRING
A java program to reverse the given string
import java.util.*;
import java.io.*;
class Reverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str;
str=sc.nextLine();
int n,i;
n=str.length();
System.out.print(n);
for(i=n-1;i>=0;i--)
{
System.out.print(str.charAt(i));
}
}
}
