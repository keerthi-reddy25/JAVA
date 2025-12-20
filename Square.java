class Demo1 extends Thread
{
  public void run ()
  {
    int avg=0;
    for(int i=1;i<=10;i++)
    {
       avg=avg+i;
    }
    double average=avg/10.0;
       System.out.println("The average of the first 10 numbers is:"+average);
  }
}
class Demo2 extends Thread
{
  
  int arr[]={1,20,50,15,30};
  public void run()
  {
     System.out.println("Squares of numbers in the array:");
     for(int i=0;i<=arr.length;i++)
     {
        System.out.println("Sqaure of" +arr[i] +"="+(arr[i]*arr[i]));
      }
   }
}
public class Square
{
   public static void main(String[] args)
   {
     Demo1 d1=new Demo1();
     Demo2 d2=new Demo2();
     d1.start();     
     d2.start();
    
   }
}