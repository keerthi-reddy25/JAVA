import java.util.Scanner;
public class Multithreading
{
  public static void main(String [] args)
  {
     System.out.println("Addition task started");
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the first number:");
     int a=s.nextInt();
     System.out.println("Enter the second number:");
     int b=s.nextInt();
     int sum=a+b; 
     System.out.println(sum);
     System.out.println("Addition task completed");
     System.out.println("----------");
     System.out.println("character printing started");
     for(int i=65;i<=75;i++)
     {
        System.out.println((char)i);
        try
        {
           Thread.sleep(1000);
        }
        catch(Exception e)
        {
           e.printStackTrace();
        }
     }
     System.out.println("character printing  task  is completed");
     System.out.println("----------");
     System.out.println("number printing started");
     for(int i=1;i<=10;i++)
     {
        System.out.println(i);
        try
        {
           Thread.sleep(1000);
        }
        catch(Exception e)
        {
           e.printStackTrace();
        }
     }
     System.out.println("number printing  task  is completed");
  }
}
