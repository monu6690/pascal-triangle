interface GeometricObject{
	double getPerimeter();
	double getArea();
}
class Circle implements GeometricObject{
   double radius=1;
	Circle(double radius){
	this.radius=radius;
	}
	 double getPerimeter(){
	 return 2*3.14*radius;

	 }
	  double getArea(){
	  return 3.14*radius*radius;
	  }
	  }
	 interface Resizable{
	 void resize(int percent);
	 }
	 class ResizableCircle extends circle implements Resizable{
	 ResizableCircle(double radius){
	 this.radius=radius;}
	 void resize(int percent){
	 radius=(radius*percent)/100;
	 System.out.print("the percent value is"+radius);
	 }
	 
	 }
	 class GeometricChanges{
	 public static void main(String[] args){
	 	double num1,num2;
	 ResizableCircle obj1=new ResizableCircle(2);
	num1= obj1.getPerimeter();
	 num2=obj1.getArea();
	 obj1.resize(20);



	 }
	 }
