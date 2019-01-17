public class CIrcle{
 private double radius;
 private String color;
 public circle(){
 radius=1.0;
 color="red";
 }
 public circle(double r){
 radius=r;

 }
 public double getradius(){
 return radius;
 }
 public double getarea(){
 return 3.14* radius*radius;
 }
 public void print(){
 System.out.print("the area is"+area);
 }
	
}