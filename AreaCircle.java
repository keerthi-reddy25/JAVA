class Circle{
double area(int r,double pi){
 pi=Math.PI;
return pi*r*r;

}
} 
public class AreaCircle{
public static void main(String [] args){
Circle c=new Circle();
System.out.println(c.area(20,26.734d));
}
}