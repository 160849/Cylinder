
import java.util.Scanner;

public class CylinderTest
{
  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter the radius: ");
    double r = kb.nextDouble();
    System.out.print("Enter the height ");
    double h = kb.nextDouble();
    Circle circle = new Circle(r);
    double area = circle.getArea();
    Cylinder cylinder = new Cylinder(h,r);
    double volume = cylinder.getVolume();
    System.out.println("radius = " + r);
    System.out.println("height = " + h);
    System.out.println("area = " + area);
    System.out.println("volume = " + volume);
    kb.close();
  }
}
