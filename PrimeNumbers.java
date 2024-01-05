import java.util.Scanner;
class PrimeNumbers
{
public static void main(String mai[])
{
int i,m=0,f=0;
Scanner x=new Scanner(System.in);
System.out.println("enter a number:");
int n=x.nextInt();
m=n/2;
if(n==0||n==1)
{
System.out.println(n+" is not a prime number");
}
else
{
for(i=2;i<=m;i++)
{
if(n%i==0)
{
System.out.println(n+" is not a prime number");
f=1;
break;
}
}
if(f==0)
{
System.out.println(n+" is a prime number");
}
}
}
}