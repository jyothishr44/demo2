import java.util.Scanner;
class NumbersDoWhile4
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int num=s.nextInt();
int i=num;
do
{
System.out.print(i+" ");
i=i-5;
}
while(i>=0);
}
}
