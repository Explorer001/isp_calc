

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
public class Base extends  Base$$Basic  {

	public Complex add(Complex a, Complex b) {
		return new Complex(a.real+b.real, a.imag+b.imag);
	}
	
	public Complex mul(Complex a, Complex b) {
		double new_real = (a.real*b.real)-(a.imag*b.imag);
		double new_imag = (a.real*b.imag)+(a.imag*b.real);
		return new Complex(new_real, new_imag);
	}
	
}