import java.util.Scanner;
class NumbersDoWhile2
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int num=s.nextInt();
int i=0;
do
{
System.out.print(i+" ");
i=i+5;
}
while(i<=num);
}
}
