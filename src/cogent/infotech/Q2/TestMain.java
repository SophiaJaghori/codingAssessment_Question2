package cogent.infotech.Q2;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Clang c = new Clang();
		JavaLang java = new JavaLang();
		Scanner sc = new Scanner(System.in);
		System.out.println("Which programming language you want to run first ");
		int choice = sc.nextInt();
		if(choice == 1) {
			java.setPriority(10);
			c.setPriority(1);
		}
		else if(choice == 2) {
			c.setPriority(10);
			java.setPriority(1);
		}
		else {
			System.out.println("Enter a valid choice!");
		}
		java.start();
		c.start();
	}

}
