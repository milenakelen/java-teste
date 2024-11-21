package ativ;

import java.util.Scanner;

public class atv_3 {

	public static void main(String[] args) {
		
		Scanner mk = new Scanner(System.in);
		
		int A, B, C, D, dif;
		
		A = mk.nextInt();
		B = mk.nextInt();
		C = mk.nextInt();
		D = mk.nextInt();
		
		dif = A * B - C * D;
		
		System.out.println("DIFERENCA =" + dif);
		
		mk.close();

	}

}
