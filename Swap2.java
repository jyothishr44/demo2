import java.util.Scanner;
class Swap2
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int num1,num2;
num1=in.nextInt();
num2=in.nextInt();
num1=num1+num2;
num2=num1-num2;
num1=num1-num2;
System.out.println(num1+" "+num2);
}
}

