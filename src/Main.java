
import java.util.*;



/**
 * TODO description
 */
public class Main {
	
	public static void main(String args[]) {
		/*Scanner sc = new Scanner(System.in);
		String rd = "";
		while (rd != "q\n") {
			System.out.println("Enter expression: ");
			rd = sc.nextLine();
			System.out.println(rd);
		}
		sc.close();
		*/
		System.out.println(new Base().add((float) 1.0, (float) 1.0));
		System.out.println(new Base().add(1, 1));
		System.out.println(new Root().root(4,2));
		Matrix a = new Matrix(2,2);
		a.set(0,0,1);
		a.set(0,1,1);
		a.set(1,0,1);
		a.set(1,1,1);
		Matrix b = new Matrix(2,2);
		b.set(0,0,1);
		b.set(0,1,1);
		b.set(1,0,1);
		b.set(1,1,1);
		Matrix c = new MatMult().mult(a, b);
		c.print();
	}
	
}