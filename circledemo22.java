class circle{
	private double radius;
	public double area;

	public void setRadius(double r){
	radius=r;
	}
	public void getRadius(){
	System.out.print(radius);
	}
	void findarea(){
	area=3.14*radius*radius;
	}
	void displayarea(){
	System.out.println("the area of circle is:" +area);
	}
}
class circledemo22{
	public static void main(String args[]){
	circle c=new circle();
	c.setRadius(5.5);
	c.getRadius();
	c.findarea();
	c.displayarea();
	}
}