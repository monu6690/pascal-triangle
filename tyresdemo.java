import java.util.*;  
class vehicle
{
void display()
{
System.out.println("this is vehicle");
}
}
class car extends vehicle
{
void display()
{
System.out.println("this is a car");
}
}
class bike extends vehicle
{
void display()
{
System.out.println("this a bike");
}
}
 
class tyresdemo
{
public static void main(String[] args)
{
int num1;
Scanner num = new Scanner(System.in);
System.out.println("please enter either  2 or 4");
num1=num.nextint();
vehicle veh;

switch (num1)
{
case 2:
    System.out.println("in case 2");

    car c= new car ();
    veh = c;
    veh.display();
    break;

case 4:
    bike b= new bike();
    veh = b;
    veh.display();
    break;
default:
     vehicle v = new vehicle();
     veh = v;
     veh.display();
}
}
}