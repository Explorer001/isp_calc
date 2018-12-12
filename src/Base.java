

/**
 * TODO description
 */
abstract class Base$$Basic {

	public int add(int i, int j) {
		return 0;
	}
	
	public int sub(int i, int j) {
		return 0;
	}
	
	public int mul(int i, int j) {
		return 0;
	}
	
	public int div(int i, int j) {
		return 0;
	}
	
}

/**
 * TODO description
 */
abstract class Base$$R extends  Base$$Basic  {


		public float add(float i, float j) {
			return i+j;
		}
		
		public float sub(float i, float j) {
			return i-j;
		}
		
		public float mul(float i, float j) {
			return i*j;
		}
		
		public float div(float i, float j) {
			return i/j;
		}
		
	
	
}

/**
 * TODO description
 */
public class Base extends  Base$$R  {

	public Complex add(Complex a, Complex b) {
		return new Complex(a.real+b.real, a.imag+b.imag);
	}
	
	public Complex mul(Complex a, Complex b) {
		double new_real = (a.real*b.real)-(a.imag*b.imag);
		double new_imag = (a.real*b.imag)+(a.imag*b.real);
		return new Complex(new_real, new_imag);
	}
	
}