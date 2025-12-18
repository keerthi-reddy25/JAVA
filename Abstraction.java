abstract class Plane{
abstract void takeoff();
abstract void fly();
abstract void land();
}
class CargoPlane extends Plane{
void takeoff(){
System.out.println("Cargopane is taking off");
}
void fly(){
System.out.println("Cargoplane is flying at low heights");
}
void land(){
System.out.println("Cargoplane is landing");
}
}


class PassengerPlane extends Plane{
void takeoff(){
System.out.println("Paseengerpane is taking off");
}
void fly(){
System.out.println("PassengerPlane is flying at medium heights");
}
void land(){
System.out.println("Passenger plane is landing");
}
}
class FighterPlane extends Plane{
void takeoff(){
System.out.println("Cargopane is taking off");
}

void fly(){
System.out.println("Fighterplane are waiting for CargoPlane");
}
void land(){
System.out.println("Fighterplane is landing");
}

}
class Airport extends Plane{
void permit(Plane ref){
ref.takeoff();
ref.fly();
ref.land();
}
}

public class Abstraction{
public static void main(String [] args){
CargoPlane cp=new CargoPlane();
PassengerPlane pp=new PassengerPlane();
FighterPlane fp=new FighterPlane();
Airport a=new Airport();
a.permit(cp);
a.permit(pp);
a.permit(fp);
}
}  
