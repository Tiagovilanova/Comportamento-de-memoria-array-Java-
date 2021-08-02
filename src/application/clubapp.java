package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Clubesdocoracao;

public class clubapp {

	public static void main(String[] args) {
		/*
		 * desenvolve um programa em que você vai descrever N times de futebol,em ordem
		 * de preferência,. Emseguidavocê vai informar o ídolo de cada clube e o estado
		 * federativo do club.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Clubesdocoracao[] vect = new Clubesdocoracao[10];
		System.out.print("Quantos clubes você pretende citar? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Time " + i);
			
			sc.nextLine();
			System.out.print("Time: ");
			String time = sc.nextLine();

			System.out.print("Crack: ");
			String crack = sc.nextLine();
			System.out.print("Estado: ");
			String estado = sc.nextLine();
			System.out.print("Ordem: ");
			int ordem = sc.nextInt();
			vect[ordem] = new Clubesdocoracao(time, crack, estado);
		}
System.out.println();
		for (int i = 1; i <= n; i++) {
			if (vect[i] != null) {
				
				System.out.println(i + ": " + vect[i]);

			}

		}

		sc.close();
	}

}
