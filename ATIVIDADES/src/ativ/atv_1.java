package ativ;

import java.util.Scanner;

public class atv_1 {

	public static void main(String[] args) {
		
		Scanner mk = new Scanner(System.in);
		
		int A, B, soma;
		
		A = mk.nextInt();
		B = mk.nextInt();
		
		soma = A + B;
		
		System.out.println("SOMA = " + soma);
		
		mk.close();

	}

}
