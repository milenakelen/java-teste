package ativ2;

import java.util.Scanner;

public class atv4 {

	public static void main(String[] args) {
		
		Scanner mk = new Scanner(System.in);
		
		int horaInicial = mk.nextInt();
		int horaFinal = mk.nextInt();
		
		int duracao;
		if(horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU:" + duracao + " HORA(S)");
		
		mk.close();

	}

}
