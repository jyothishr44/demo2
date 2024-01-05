import java.util.Scanner;
class NumbersDoWhile1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int num=s.nextInt();
int i=1;
do
{
System.out.print(i+" ");
i++;
}
while(i<=num);
}
}
