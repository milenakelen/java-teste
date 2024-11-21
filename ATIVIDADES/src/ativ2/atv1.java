package ativ2;

import java.util.Scanner;

public class atv1 {

	public static void main(String[] args) {
		
		Scanner mk = new Scanner(System.in);
		
		int N = mk.nextInt();
		
		if (N < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");
		}
		
		mk.close();

	}

}
