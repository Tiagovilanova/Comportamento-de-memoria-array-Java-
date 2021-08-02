package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Ex2;

public class ex2 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro N e os dados (nome e preço) de N
		 * Produtos. Armazene os N produtos em um vetor. Em seguida, mostrar o preço
		 * médio dos produtos.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		
		
		Ex2[] vect = new Ex2[n];
		
		for (int i=0; i<n;i++) {
		sc.nextLine();
		String nome=sc.nextLine();
		double price= sc.nextDouble();
		
		vect[i]=new Ex2(nome, price);
			
		}
		
		double soma=0;
		for (int i=0; i<n;i++) {
			soma+=vect[i].getPrice();
		}
		
		double media=soma/n;
		
		System.out.printf("AVERAGE PRICE = %.2f", media);
		sc.close();
	}

}
