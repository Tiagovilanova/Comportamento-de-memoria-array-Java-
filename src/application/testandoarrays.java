package application;

import java.util.Locale;
import java.util.Scanner;

public class testandoarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int[] f = new int[] { 4, 7, 2 };

		
		
		for (int au : f) {
			System.out.println(au);

		}
		// alterando o valor do array
		System.out.println("mudando a posição 0 do vetor f");
		f[0] = 50;

		for (int au : f) {
			System.out.println(au);

		}

		System.out.println("comprimento do arrays f");
		System.out.println(f.length);
		sc.close();

	}

}
