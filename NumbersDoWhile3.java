import java.util.Scanner;
class NumbersDoWhile3
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int num=s.nextInt();
int i=num;
do
{
System.out.print(i+" ");
i--;
}
while(i>=0);
}
}
