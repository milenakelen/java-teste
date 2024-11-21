package ativ2;

import java.util.Scanner;

public class atv2 {

	public static void main(String[] args) {

		Scanner mk = new Scanner(System.in);
		
		int N = mk.nextInt();
		
		if (N % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		
		mk.close();

	}

}
