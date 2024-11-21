package ativ;

import java.util.Locale;
import java.util.Scanner;

public class atv_5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner mk = new Scanner(System.in);
		
		int cod1, cod2, qtd1, qtd2;
		double preco1, preco2, valor;
		
		cod1 = mk.nextInt();
		qtd1 = mk.nextInt();
		preco1 = mk.nextDouble();
		
		cod2 = mk.nextInt();
		qtd2 = mk.nextInt();
		preco2 = mk.nextDouble();
		
		valor = preco1 * qtd1 + preco2 * qtd2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valor);
		
		mk.close();

	}

}
