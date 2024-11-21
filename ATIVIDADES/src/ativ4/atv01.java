package ativ4;

import java.util.Scanner;

public class atv01 {

	public static void main(String[] args) {

				Scanner mk = new Scanner(System.in);

				int x = mk.nextInt();
				
				for (int i=1; i<=x; i++) {
					if (i % 2 != 0) {
						System.out.println(i);
					}
				}
				
				mk.close();
			}

	}