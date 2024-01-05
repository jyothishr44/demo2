import java.util.Scanner;
class Swap
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int num1,num2;
num1=in.nextInt();
num2=in.nextInt();
int temp;
temp=num1;
num1=num2;
num2=temp;
System.out.println(num1+" "+num2);
}
}

