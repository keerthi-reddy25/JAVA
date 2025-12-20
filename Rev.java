import java.util.Scanner;
public class Rev{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter n value");
int n=sc.nextInt();
int i=n;
int rev=0;
while(i>0)
{
int r=i%10;
rev=rev*10+r;
System.out.print(r);
i=i/10;
}
}
}
