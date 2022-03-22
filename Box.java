package trainingassessment;

public class Box {
	double l,b,w;
	public Box(double length,double breadth,double width) {
		l=length;
		b=breadth;
		w=width;
		

}
	public double CalVol()
	{
		double vol;
		vol=l*b*w;
		return vol;
	}

public static void main(String args[])
{
	Box b1 = new Box(9.8,7.4,2.5);
	double volume;
	 volume=b1.CalVol();
	
	System.out.println("the volume of box" + volume);
}
}

