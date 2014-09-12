public class Circle
{
  public double radius;
  
  public Circle(double r)//insert parameter as a double
  {
    radius = r;//sets the argument entered as the private variable radius
  }

  public double getArea()//method to get the area
  {
    return Math.PI * radius * radius;
  }
  public double getAreapi(){//methods to get the area without PI as a number, but as the sign ¹
	  return radius * radius;
  }

}
