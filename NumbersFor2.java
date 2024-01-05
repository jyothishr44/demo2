import java.util.Scanner;
class NumbersFor2
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int num=s.nextInt();
for(int i=0;i<=num;i=i+5)
{
System.out.print(i+" ");
}
}
}
