import java.util.Scanner;
class NumbersWhile2
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int num=s.nextInt();
int i=0;
while(i<=num)
{
System.out.print(i+" ");
i=i+5;
}
}
}
