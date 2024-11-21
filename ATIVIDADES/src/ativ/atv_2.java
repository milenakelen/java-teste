package ativ;

import java.util.Locale;
import java.util.Scanner;

public class atv_2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner mk = new Scanner(System.in);
		
		double F, A, pi = 3.14159;
		
		F = mk.nextDouble();
		
		A = pi * F * F;
		
		System.out.printf("A = %.4f%n", A);
		
		mk.close();

	}

}
