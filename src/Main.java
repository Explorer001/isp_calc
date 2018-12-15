
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
		double v1;
		String rd = "";
		System.out.print("Val 1: ");
		v1 = Double.parseDouble(sc.nextLine());
		System.out.println();
		System.out.println();
		System.out.println("1: Floor");
		System.out.println("2: Ceil");
		rd = sc.nextLine();
		System.out.println(rd);
		if (rd.equals("1")) {
			double s = new Round().floor(v1);
			System.out.println("Solution is " + Double.toString(s));
			l.log("floor("+Double.toString(v1)+") = " + Double.toString(s));
		} else if (rd.equals("2")) {
			double s = new Round().ceil(v1);
			System.out.println("Solution is " + Double.toString(s));
			l.log("ceil("+Double.toString(v1)+") = " + Double.toString(s));
		}
	}
	
	public static void eval_logic() {
		int v1, v2;
		System.out.print("Val 1: ");
		v1 = sc.nextInt();
		System.out.println();
		System.out.print("Val 2: ");
		v2 = sc.nextInt();
		System.out.println();
		System.out.println("1: and");
		System.out.println("2: or");
		System.out.println("3: not");
		System.out.println("4: xor");
		System.out.println("5: nor");
		System.out.println("6: nand");
		System.out.println("7: directional");
		System.out.println("8: bidirectional");
		System.out.print("Selection=");
		int sel = sc.nextInt();
		int s;
		switch (sel) {
		case 1:
			s = new Logic().and(v1, v2);
			System.out.println("Solution is " + Integer.toString(s));
			l.log(Integer.toString(v1)+ " and "+Integer.toString(v2)+" = "+Integer.toString(s));
			break;
		case 2:
			s = new Logic().or(v1, v2);
			System.out.println("Solution is " + Integer.toString(s));
			l.log(Integer.toString(v1)+ " or "+Integer.toString(v2)+" = "+Integer.toString(s));
			break;
		case 3:
			s = new Logic().not(v1);
			System.out.println("Solution is " + Integer.toString(s));
			l.log("not " + Integer.toString(v1) +" = "+Integer.toString(s));
			break;
		case 4:
			s = new Logic().xor(v1, v2);
			System.out.println("Solution is " + Integer.toString(s));
			l.log(Integer.toString(v1)+ " xor "+Integer.toString(v2)+" = "+Integer.toString(s));
			break;
		case 5:
			s = new Logic().nor(v1, v2);
			System.out.println("Solution is " + Integer.toString(s));
			l.log(Integer.toString(v1)+ " nor "+Integer.toString(v2)+" = "+Integer.toString(s));
			break;
		case 6:
			s = new Logic().nand(v1, v2);
			System.out.println("Solution is " + Integer.toString(s));
			l.log(Integer.toString(v1)+ " nand "+Integer.toString(v2)+" = "+Integer.toString(s));
			break;
		case 7:
			s = new Logic().directional(v1, v2);
			System.out.println("Solution is " + Integer.toString(s));
			l.log(Integer.toString(v1)+ " => "+Integer.toString(v2)+" = "+Integer.toString(s));
			break;
		case 8:
			s = new Logic().bidirectional(v1, v2);
			System.out.println("Solution is " + Integer.toString(s));
			l.log(Integer.toString(v1)+ " <=> "+Integer.toString(v2)+" = "+Integer.toString(s));
			break;
		}
	}
	
	public static void eval_trig() {
		double v1;
		System.out.print("Val 1: ");
		v1 = sc.nextDouble();
		System.out.println();
		System.out.println("1: sin");
		System.out.println("2: cos");
		System.out.println("3: tan");
		System.out.println("4: asin");
		System.out.println("5: acos");
		System.out.println("6: atan");
		System.out.print("Selection=");
		int sel = sc.nextInt();
		double s;
		switch (sel) {
		case 1:
			s = new Trigonometric().sin(v1);
			System.out.println("Solution is " + Double.toString(s));
			l.log("sin("+Double.toString(v1)+") = "+Double.toString(s));
			break;
		case 2:
			s = new Trigonometric().cos(v1);
			System.out.println("Solution is " + Double.toString(s));
			l.log("cos("+Double.toString(v1)+") = "+Double.toString(s));
			break;
		case 3:
			s = new Trigonometric().tan(v1);
			System.out.println("Solution is " + Double.toString(s));
			l.log("tan("+Double.toString(v1)+") = "+Double.toString(s));
			break;
		case 4:
			s = new Trigonometric().asin(v1);
			System.out.println("Solution is " + Double.toString(s));
			l.log("asin("+Double.toString(v1)+") = "+Double.toString(s));
			break;
		case 5:
			s = new Trigonometric().acos(v1);
			System.out.println("Solution is " + Double.toString(s));
			l.log("acos("+Double.toString(v1)+") = "+Double.toString(s));
			break;
		case 6:
			s = new Trigonometric().atan(v1);
			System.out.println("Solution is " + Double.toString(s));
			l.log("atan("+Double.toString(v1)+") = "+Double.toString(s));
			break;
		}
	}
	
	public static void main(String args[]) {
		boolean run = true;
		while (run) {
			run = eval();
		}
		sc.close();
	}
	
}