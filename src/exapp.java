import java.util.Locale;
import java.util.Scanner;

public class exapp {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler um número inteiro N e a altura de N pessoas.
		 * Armazene as N alturas em um vetor. Em seguida, mostrar a altura média dessas
		 * pessoas.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		double soma = 0;

		for (int i = 0; i < n; i++) {
			soma += vect[i];
		}

		double media = soma / n;

		System.out.printf("AVERAGE HEIGHT = %.2f", media);

		sc.close();
	}

}
