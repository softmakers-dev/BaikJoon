import java.util.Scanner;
import java.util.Stack;

public class Question2812 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = 0;
		int k = 0;
		String targNum = null;

		for(int i=0; i<2; i++) {

			switch(i) {

				case 0 : if(scanner.hasNext()) {
						n = scanner.nextInt();
						k = scanner.nextInt();
					}
					break;
				case 1 : targNum = scanner.next();
			}
		} // end of for

		Stack<String> targStack = new Stack<String>();
		int swapCount = 0;
		for(int j=0; j<targNum.length(); j++) {

			String newNum = String.valueOf(targNum.charAt(j));
			while(!targStack.isEmpty() &&
					(Integer.parseInt(targStack.peek()) < Integer.parseInt(newNum)) &&
					(swapCount < k)) {

				targStack.pop();
				swapCount++;
			}

			targStack.push(newNum);
		} // end of for

		StringBuffer sbTarg = new StringBuffer();
		for(int z=0; z<targStack.size(); z++) {

			sbTarg.append(targStack.get(z));
		}

		System.out.print(sbTarg.toString());
	}
}
