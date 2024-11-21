package ativ3;

import java.util.Scanner;

public class atv1 {

	public static void main(String[] args) {
		
		Scanner mk = new Scanner(System.in);
		
		int senha = mk.nextInt();
		
		while (senha != 1987) {
			System.out.println("Senha Invalida");
			senha = mk.nextInt();
		}
		
		System.out.println("Acesso permitido");
		
		mk.close();

	}

}
