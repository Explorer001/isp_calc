

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
		return (j == 0)? 0 : i/j;
	}
	
}

/**
 * TODO description
 */
abstract class Base$$C extends  Base$$Basic  {

	public Complex add(Complex a, Complex b) {
		return new Complex(a.real+b.real, a.imag+b.imag);
	}
	
	public Complex mul(Complex a, Complex b) {
		double new_real = (a.real*b.real)-(a.imag*b.imag);
		double new_imag = (a.real*b.imag)+(a.imag*b.real);
		return new Complex(new_real, new_imag);
	}
	
}

/**
 * TODO description
 */
public class Base extends  Base$$C  {
	
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