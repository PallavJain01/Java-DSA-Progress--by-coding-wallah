package Day5;
import java.util.Scanner;

public class Day5 {

	public static void main(String[] args) {
		// System.out.println("Hi 1");
		int num = 85;
		int num2 = 20;
		Scanner scan = new Scanner(System.in);

		String pay = scan.next();
		scan.close();

		if (pay.equals("Success"))
			System.out.println("Yes Registerd Successfuly !!");
		else
			System.out.println("Failed to register..");
		if (num > 90) {
			System.out.println("A");
		} else if (num > 70 && num < 80) {
			System.out.println("C");
		} else if (num > 80) {
			System.out.println("B");
		} else if (num > 50) {
			System.out.println("D");
		}
    
		int marks = 90;
    switch (marks) {
      case 1: {
      }
      case 4 : {
      }
      default: {
      }
    }
		int mnum = 2;
		if (marks >= 80)
			switch (marks) {
				// case "shivam30" : if(10>2) System.out.println("A"); break;
				case 90:
					switch (mnum) {
						case 2:
							System.out.println("B");
					}
			}

		if (true) {
			System.out.println("hi");
			// mnum = 20;
		}

	}
}