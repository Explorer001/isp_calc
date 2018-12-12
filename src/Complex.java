

/**
 * TODO description
 */
public class Complex {
	double real;
	double imag;
	
	public Complex(double r, double i) {
		this.real = r;
		this.imag = i;
	}
	
	public String toString() {
		if (((Complex) this).imag >= 0) {
			return Double.toString(((Complex) this).real) + " + " + Double.toString(((Complex) this).imag) + "i";
		}
		return Double.toString(((Complex) this).real) + " - " + Double.toString(((Complex) this).imag) + "i";
	}
	
	public double abs() {
		Root root = new Root();
		return root.sqrt(root.pow(((Complex) this).real, 2) + root.pow(((Complex) this).imag, 2));
	}
}