class Restaurant 
{

synchronized  void foodOrder(String orderName)
{
String name=Thread.currentThread().getName();
System.out.println("Thread" + name +" customer is has odered"+ orderName);
try
{
wait();
}
catch(Exception e)
{
e.printStackTrace();
}
System.out.println("Thread" + name +"food is delivered to the customer");
}


synchronized  void cookedOrder(String orderName)
{
String name=Thread.currentThread().getName();
System.out.println("Thread" + name + "chief has receivedthe order"+ orderName);
System.out.println("Thread" + name + "cooking is under progress");
try {
   Thread.sleep(1000);
}
catch(Exception e)
{
e.printStackTrace();
}
System.out.println("Thread" + name + "food is ready");
notifyAll();
}



synchronized void receivedOrder( String orderName)
{
String name=Thread.currentThread().getName();
System.out.println("Thread" + name + " customer is choosing order ");
try
{
wait();
} 
catch(Exception e)
{
e.printStackTrace();
}
System.out.println("Thread" + name + " customer has received the order" + orderName);
}
}


public class Order
{
public static void main(String ards[])
{
  Restaurant r=new Restaurant();
  String orderName="Biryani";
     Thread t1=new Thread("Customer"){
public void run()
{
r.receivedOrder(orderName);
}
};
t1.start();

     Thread t2=new Thread("Waiter"){
public void run()
{
r.foodOrder(orderName);
}
};
t2.start();

     Thread t3=new Thread("Cook"){
public void run()
{
r.cookedOrder(orderName);
}
};
t3.start();
}
}
