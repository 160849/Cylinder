
public class Cylinder{
	private Circle base;
	private double height;
	
	
	public Cylinder(double h, double r){//insert 2 double variables
	height = h;//set 1 double to the height
	base = new Circle(r); //set one as the radius of the circle base
	}
	

	public double getVolume(){//find the volume of the cylinder as a double
		return base.getArea() * height;
	}
	public double getVolumepi(){//find the volume of the cylinder without PI as a number, but as ¹
		return base.getAreapi() * height;
	}
	
}
