import java.util.Scanner;
class LargestNum
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int max;
if(a>b)
{
if(a>c)
max =a;
else
max=c;
}
else
{
if(b>c)
max=b;
else
max=c;
}
System.out.print("maximum no is: "+max);
}
}
