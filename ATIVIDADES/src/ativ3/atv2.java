package ativ3;

import java.util.Scanner;

public class atv2 {

	public static void main(String[] args) {
		
		Scanner mk = new Scanner(System.in);
		
		int x = mk.nextInt();
		int y = mk.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			
			x = mk.nextInt();
			y = mk.nextInt();
		}
		mk.close();
	}

}
