
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
	}
	
}