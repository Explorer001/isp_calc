
import java.lang.Math;


/**
 * TODO description
 */
public class Root {
	public double sqrt(double val) {
		return Math.sqrt(val);
	}
	
	public double root(double val, double base) {
		return Math.pow(Math.E, Math.log(val)/base);
	}
	
	public double pow(double a, double b) {
		return Math.pow(a, b);
	}
}