

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
abstract class Base$$N extends  Base$$Basic  {


		public int add(int i, int j) {
			return i+j;
		}
		
		public int sub(int i, int j) {
			return i-j;
		}
		
		public int mul(int i, int j) {
			return i*j;
		}
		
		public int div(int i, int j) {
			return i/j;
		}
		

	
}

/**
 * TODO description
 */
public class Base extends  Base$$N  {


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