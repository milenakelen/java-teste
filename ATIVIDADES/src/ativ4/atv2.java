package ativ4;

import java.util.Scanner;

public class atv2 {

	public static void main(String[] args) {
		
		Scanner mk = new Scanner(System.in);
		
		int n = mk.nextInt();
		
		int in = 0;
		int out = 0;
		
		for (int i=0; i<n; i ++) {
			int x = mk.nextInt();
			if (x >= 10 && x <= 20) {
				in = in + 1;
			}
			else {
				out = out + 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		mk.close();

	}

}
