class Circle
{
  double radius;
  double area;

  void findarea()
  {
  area =3.14*radius*radius;
  }

  void displayarea()
  {
  System.out.print("area is ="+area);
  }	  
}

class classesObjects
{
	public static void main(String args[])
	{
	Circle c = new Circle();
	c.radius=2;
	c.findarea();
	c.displayarea();
    }
}