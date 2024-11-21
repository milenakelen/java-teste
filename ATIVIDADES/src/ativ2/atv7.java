package ativ2;

import java.util.Locale;
import java.util.Scanner;

public class atv7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner mk = new Scanner(System.in);
		
		double x = mk.nextDouble();
		double y = mk.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}
		else if (x == 0.0) {
			System.out.println("Eixo y");
		}
		else if (y == 0.0) {
			System.out.println("Eixo x");
		}
		else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}
		else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		
		mk.close();

	}

}
