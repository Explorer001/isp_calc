
import java.util.*;



/**
 * TODO description
 */
public class Main {
	
	static Logging l = new Logging("log");
	static Scanner sc = new Scanner(System.in);
	
	public static boolean eval() {
		String rd = "";
		boolean rv = true;
		System.out.println("1: Basic math");
		System.out.println("2: Matrix");
		System.out.println("3: Round");
		System.out.println("4: Logic");
		System.out.println("5: Trigonometric");
		rd = sc.nextLine();
		System.out.println(rd);
		if (rd.equals("q")) {
			rv = false;
		} else if (rd.equals("1")) {
			eval_base();
		} else if (rd.equals("2")) {
			eval_mat();
		} else if (rd.equals("3")) {
			eval_round();
		} else if (rd.equals("4")) {
			eval_logic();
		} else if (rd.equals("5")) {
			eval_trig();
		}
		return rv;
	}
	
	public static void eval_base() {
		double v1, v2;
		String rd = "";
		System.out.print("Val 1: ");
		v1 = Double.parseDouble(sc.nextLine());
		System.out.println();
		System.out.print("Val 2: ");
		v2 = Double.parseDouble(sc.nextLine());
		System.out.println();
		System.out.println("1: Add");
		System.out.println("2: Sub");
		System.out.println("3: Mult");
		System.out.println("4: Div");
		rd = sc.nextLine();
		System.out.println(rd);
		if (rd.equals("1")) {
			double s = new Base().add(v1, v2);
			System.out.println("Solution is " + Double.toString(s));
			l.log(Double.toString(v1) + " + " + Double.toString(v2) + " = " + Double.toString(s));
		} else if (rd.equals("2")) {
			double s = new Base().sub(v1, v2);
			System.out.println("Solution is " + Double.toString(s));
			l.log(Double.toString(v1) + " - " + Double.toString(v2) + " = " + Double.toString(s));
		} else if (rd.equals("3")) {
			double s = new Base().mul(v1, v2);
			System.out.println("Solution is " + Double.toString(s));
			l.log(Double.toString(v1) + " * " + Double.toString(v2) + " = " + Double.toString(s));
		} else if (rd.equals("4")) {
			double s = new Base().div(v1, v2);
			System.out.println("Solution is " + Double.toString(s));
			l.log(Double.toString(v1) + " / " + Double.toString(v2) + " = " + Double.toString(s));
		}
	}
	
	public static Matrix eval_mat() {
		int n,m;
		System.out.println("Matrix size:");
		System.out.print("n=");
		n = Integer.parseInt(sc.nextLine());
		System.out.println();
		System.out.print("m=");
		m = Integer.parseInt(sc.nextLine());
		System.out.println();
		Matrix M = new Matrix(n, m);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("("+Integer.toString(i)+", "+Integer.toString(j)+")=");
				M.set(i,j,Double.parseDouble(sc.nextLine()));
			}
		}
		M.print();
		return M;
	}
	
	public static void eval_round() {
		
	}
	
	public static void eval_logic() {
		
	}
	
	public static void eval_trig() {
		
	}
	
	public static void main(String args[]) {
		boolean run = true;
		while (run) {
			run = eval();
		}
		sc.close();
	}
	
}