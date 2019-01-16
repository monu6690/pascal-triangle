class circle{
	private double radius;
	public double area;

	public void setradius(){
	radius=5;
	}
	public void getradius(){
	System.out.print(radius);
	}
	void findarea(){
	area=3.14*radius*radius;
	}
	void displayarea(){
	System.out.println("the area of circle is:" +area);
	}
}
class circledemo2{
	public static void main(String args[]){
	circle c=new circle();
	c.setradius();
	c.getradius();
	c.findarea();
	c.displayarea();
	}
}