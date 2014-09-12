
import java.util.Scanner;

public class CircleTest
{
  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter the radius: ");
    double r = kb.nextDouble();
    System.out.print("Enter the height ");
    double h = kb.nextDouble();
    Circle circle = new Circle(r);
    double areapi = circle.getAreapi();
    double area = circle.getArea();
    Cylinder cylinder = new Cylinder(h,r);
    double volumepi = cylinder.getVolumepi();
    double volume = cylinder.getVolume();
    System.out.println("radius = " + r);
    System.out.println("height = " + h);
    System.out.println("area = " + areapi + "¹ or " + area);//gives both the area of the circle as a double number and a number multiplied by ¹
    System.out.println("volume = " + volumepi + "¹ or " + volume);//gives both the volume of the cylinder as a double number and a number multiplied by ¹
    kb.close();
  }
}
