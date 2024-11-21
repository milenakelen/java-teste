package ativ;

import java.util.Locale;
import java.util.Scanner;

public class atv_4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner mk = new Scanner(System.in);
		
		int numero, horas;
		double valorHora, salario;
		
		numero = mk.nextInt();
		horas = mk.nextInt();
		valorHora = mk.nextDouble();
		
		salario = valorHora * horas;
		
		System.out.println("NUMBER =" + numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		mk.close();

	}

}
