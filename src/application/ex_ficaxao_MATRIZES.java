package application;

import java.util.Locale;
import java.util.Scanner;

public class ex_ficaxao_MATRIZES {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler dois números inteiros M e N, e depois ler uma
		 * matriz de M linhas por N colunas contendo números inteiros, podendo haver
		 * repetições. Em seguida, ler um número inteiro X que pertence à matriz. Para
		 * cada ocorrência de X, mostrar os valores à esquerda, acima, à direita e
		 * abaixo de X, quando houver, conforme exemplo.
		 * 
		 * https://github.com/acenelio/matrix2-java
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int M, N, X;
		M = sc.nextInt();
		N = sc.nextInt();
		
		int [][] mat= new int[M][N];
		
		for (int i= 0; i<mat.length;i++) {
			for (int j=0; j<mat[i].length;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		
		X=sc.nextInt();
	

for (int i =0; i<mat.length; i++) {
	for(int j=0; j<mat[i].length;j++) {
		if(X==mat[i][j]) {
			System.out.print("Position "+i+","+j+ ":" );
			System.out.println();
			if(j>0) {
				System.out.println("left: "+ mat[i][j-1]);
			}
			if(i>0) {
				System.out.println("Up: "+mat[i-1][j]);
			}
			if(j<mat[i].length-1) {
				System.out.println("Right: " +mat[i][j+1])	;
			}
			if(i<mat.length-1) {
				System.out.println("Down: "+mat[i+1][j]);
			}
			
			
			
			
	}
}

}
		
		
		sc.close();

	}

}
