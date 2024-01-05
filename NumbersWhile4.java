import java.util.Scanner;
class NumbersWhile4
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int num=s.nextInt();
int i=num;
while(i>=0)
{
System.out.print(i+" ");
i=i-5;
}
}
}
