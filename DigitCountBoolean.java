import java.util.Scanner;
class DigitCountBoolean
{
static boolean checkDigit(char c)
{
boolean b;
if((c=='0'||c=='1'||c=='2'||c=='3'|| c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'))
{
b=true;
}
else
{
b=false;
}
return b;
}
public static void main(String args[])
{
int count=0;
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
for(int i=0;i<s.length();i++)
{
if(checkDigit(s.charAt(i)))
{
count++;
}
}
System.out.println(count);
}
}