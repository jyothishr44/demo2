import java.util.Scanner;
class PatternWhile
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char c=s.next().charAt(0);
int row=s.nextInt();
print(c,row);
}
public static void print(char c,int n)
{
int i=1;
while(i<=n)
printLine(c,i);
i++;
}
public static void printLine(char c,int col)
{
System.out.println(" ");
int j=1;
while(j<=col)
j++;
System.out.print(c);

}
}


