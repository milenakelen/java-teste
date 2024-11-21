package ativ2;

import java.util.Scanner;

public class atv5 {

	public static void main(String[] args) {
		
		Scanner mk = new Scanner(System.in);
		
		int codigo = mk.nextInt();
		int quantidade = mk.nextInt();
		
		double total;
		if (codigo == 1) {
			total = quantidade * 4.5;
		}
		else if (codigo == 2) {
			total = quantidade * 4.5;
		}
		else if (codigo == 3) {
			total = quantidade * 5.0;
		}
		else if (codigo == 4) {
			total = quantidade * 2.0;
		}
		else {
			total = quantidade * 1.5;
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		mk.close();

	}

}
