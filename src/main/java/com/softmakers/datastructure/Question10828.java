import java.util.ArrayList;
import java.util.Scanner;

public class Question10828 {

	public static ArrayList<Integer> stack = new ArrayList<Integer>();

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int countOfCommand = scanner.nextInt();

		String[] commands = new String[countOfCommand];
		for(int i=0; i<=countOfCommand; i++) {

			if (scanner.hasNextLine()) {
				commands[i] = scanner.nextLine();
			}
		}
		for(int k=0; k<countOfCommand; k++) {
			System.out.println(commands[k]);
		}

		for(int j=0; j<countOfCommand; j++) {

			String[] commandArr = commands[j].split(" ");
			String command = commandArr[0];
			String number = commandArr.length > 1 ? commandArr[1] : null;

			switch(command) {

				case "push":push(number); break;
				case "pop":pop(); break;
				case "size":size(); break;
				case "empty":empty(); break;
				case "top": top(); break;
			}
		} // end of for
	} // end of main

	public static void push(String number) {

		stack.add(Integer.parseInt(number));
	}

	public static void pop() {

		if(stack.size() > 0) {
			int top = stack.get(stack.size() - 1);
			stack.remove(stack.size() - 1);
			System.out.println(top);
		} else {
			System.out.println(-1);
		}
	}

	public static void size() {

		System.out.println(stack.size());
	}

	public static void empty() {

		if(stack.size() == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

	public static void top() {

		int top = stack.size() > 0 ? stack.get(stack.size() - 1) : -1;
		System.out.println(top);
	}
}
