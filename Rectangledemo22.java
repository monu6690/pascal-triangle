  class Shape{
 public void display(){
 System.out.print("hello");
 }
 }
   class Rectangle extends Shape{
 public void display(){
 System.out.println("hello bro");
 }
 public void increaselength(){
  System.out.println("length is increase");


 }	

}
class Rectangledemo22{
	public static void main(String[] args){
	Shape s;
	s= new Rectangle();
	s.display();
	Rectangle c=(Rectangle) s;
	c.increaselength();
	c.display();

	}
}
