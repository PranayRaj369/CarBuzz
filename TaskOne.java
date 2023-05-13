package demiGod;
import java.util.Scanner;

public class TaskOne {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter input string: ");
		String input = scanner.nextLine();
		scanner.close();
		String[] arlst = input.split("[_ ]");
		if (arlst.length == 1) {
			arlst = input.split("(?=[A-Z])");
		}
		int indx = 0;
		int count = arlst.length;
		while (indx != count) {
			String[] templst = new String[count];
			templst = arlst.clone();
			templst[indx] = templst[indx] + " ";
			for (String i : templst) {
				System.out.print(i.toLowerCase());
			}
			System.out.println();
			indx = indx + 1;
			if (indx == count - 1) {
				for (String i : templst) {
					System.out.print(i.toLowerCase() + " ");
				}
				break;
			}
		}

	}
}
