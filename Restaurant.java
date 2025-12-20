class Order
{
  synchronized void recivedOrder()
  {
    System.out.println("Thread Customer:customer is choosing an order...");
   }
  synchronized void waiterOrder()
  {
    System.out.println("Thread Waiter:Customer chosen a briyani...");
  }
  synchronized void cookOrder()
  {
     System.out.println("Thread cook:Cook is preparing order.....");
  }
}


class Customer extends Threads
{
   Order order=new Order();
   Customer(Order order)
   {
      this.order=order;
   }
   public void run()
   {
      order.receiveOrder();

}
 
class Waiter extends Threads
{ 
   Order order=new Order();
   Customer(Order order)
   {
      this.order=order;
   }
   public void run()
  {
     order.waiterOrder();
   }
}

class Cook extends Threads
{
  Order order=new Order();
   Customer(Order order)
   {
      this.order=order;
   }
  public void run()
  {
     order.cookOrder();
  }
}
   
public class Restaurant
{
  public static void main(String [] args)
  {
    Order order=new Order();
    Customer c=new Customer(order);
    Waiter w=new Waiter(order);
    Cook ck=new Cook(order);
    c.start();
    w.start();
    ck.start();
  }
}