

/**
 * TODO description
 */
public  class Root {

	public int sqrt(int val) {
		return (int) Math.sqrt(val);
	}
	
	public int root(int val, int base) {
		return (int) Math.pow(Math.E, Math.log(val)/base);
	}
	
	public int pow(int a, int b) {
		return (int) Math.pow(a, b);
	}
	
}