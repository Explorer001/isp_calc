

/**
 * TODO description
 */
abstract class Base$$Basic {

	public double add(double i, double j) {
		return i+j;
	}
	
	public double sub(double i, double j) {
		return i-j;
	}
	
	public double mul(double i, double j) {
		return i*j;
	}
	
	public double div(double i, double j) {
		return i/j;
	}
	
}

/**
 * TODO description
 */
public class Base extends  Base$$Basic  {
	
	public double add(double i, double j) {
		System.out.println("Adding " + Double.toString(i) + " and " + Double.toString(j));
		return super.add(i,j);
	}
	
	public double sub(double i, double j) {
		System.out.println("Substract " + Double.toString(i) + " and " + Double.toString(j));
		return super.sub(i,j);
	}
	
	public double mul(double i, double j) {
		System.out.println("Mult " + Double.toString(i) + " and " + Double.toString(j));
		return super.mul(i,j);
	}
	
	public double div(double i, double j) {
		System.out.println("Div " + Double.toString(i) + " and " + Double.toString(j));
		return super.div(i,j);
	}
	
}