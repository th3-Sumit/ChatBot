import java.util.Scanner;

public class ChatBot {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello.... !!! What is your name : ");
		System.out.print(">>>>");
		String name =  sc.nextLine();
		
		System.out.println("Ok "+name +" How are you ?");
		while(true) {
			System.out.println(">>>>");
			String c = sc.nextLine();
			c = c.toUpperCase();
			if (c.indexOf("FINE") >= 0) {
				System.out.println("Good to know "+name);
			}
			else if (c.indexOf("NOT GOOD") >= 0) {
				System.out.println("Don't Worry you will be fine "+name);
			}
			else if (c.indexOf("GOOD") >= 0) {
				System.out.println("that's great "+name);
			}
			
			else {
				System.out.println("Oooooo ");
			}
		}
		
	}

}
