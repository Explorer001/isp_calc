

/**
 * TODO description
 */
public class Logic {
	
	public static int max(int a, int b)
	{
		return (a > b)? a : b;
	}
	
	public int and(int a, int b) {
		return a*b;
	}
	
	public int or(int a, int b) {
		return max(a, b);
	}
	
	public int not(int a) {
		return 1-a;
	}
	
	public int xor(int a, int b) {
		return ((Logic) this).and(((Logic) this).or(a, b), ((Logic) this).not(((Logic) this).and(a, b)));
	}
	
	public int nor(int a, int b) {
		return ((Logic) this).not(((Logic) this).or(a, b));
	}
	
	public int nand(int a, int b) {
		return ((Logic) this).not(((Logic) this).and(a, b));
	}
	
	public int directional(int a, int b) {
		return ((Logic) this).nor(((Logic) this).not(a), b);
	}
	
	public int bidirectional(int a, int b) {
		return ((Logic) this).and(((Logic) this).directional(a, b), ((Logic) this).directional(b, a));
	}
}