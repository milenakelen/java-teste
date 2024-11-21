package ativ2;

import java.util.Scanner;

public class atv3 {

	public static void main(String[] args) {
		
		Scanner mk = new Scanner(System.in);
		
		int A = mk.nextInt();
		int B = mk.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("São Multiplos");
		}
		else {
			System.out.println("Não são multiplos");
		}

		mk.close();
	}

}
