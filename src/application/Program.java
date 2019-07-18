package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		method1();
		System.out.println("Fim de programa!");
	}
	
	public static void method1() {
		System.out.println("metodo 1 start");
		method2();
		System.out.println("metodo 1 fim");
	}
	
	public static void method2() {
		System.out.println("metodo 2 start");
		Scanner sc = new Scanner(System.in);
		try {
			
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
			} 
			catch (ArrayIndexOutOfBoundsException e ) {
				System.out.println("Invalid Position!");
				e.printStackTrace();
				sc.next();
			}
			catch (InputMismatchException e ) {
				System.out.println("Input error!");
			}
		sc.close();
		System.out.println("metodo 2 fim");
	}

}
