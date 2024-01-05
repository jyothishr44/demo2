import java.util.Scanner;
class RepeatedChar
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String s=in.nextLine();
char c=in.next().charAt(0);
int count=0;
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)==c)
count++;
}
System.out.println("Frequency of "+c+" is:"+count);
}
}

