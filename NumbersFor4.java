import java.util.Scanner;
class NumbersFor4
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int num=s.nextInt();
for(int i=num;i>=0;i=i-5)
{
System.out.print(i+" ");
}
}
}
