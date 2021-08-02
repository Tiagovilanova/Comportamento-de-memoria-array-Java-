package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class list {

	public static void main(String[] args) {

		// instanciar lista

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		// inserir novo elemento na posi��o dois na lista

		list.add(2, "Marco");

		// tamanho da lista
		System.out.println(list.size());
		for (String x : list) {
			System.out.println(x);
		}
		/*
		 * remover elemento list.remove("Anna"); nesse caso, mesmo sendo outra inst�ncia
		 * de string o programa consegue remover por compara��o
		 */

		System.out.println("--------------------");
		System.out.println("Remo��o pela posi��o");
		list.remove(1);
		System.out.println("Remo��o por predicado");
		list.removeIf(x -> x.charAt(0) == 'M'); // remover que come�a com a letra M. � uma fun��o lambida que se chama
												// predicado, pois retorna em verdadeiro e falso
		/*
		 * INTERPRETA��O DESSA FUN��O L�MBIDA: pega esse valor do tipo String, e em
		 * seguida retorne se esse x.charAt(0) � igual a 'M'
		 */
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("--------------------");
		System.out.println("ENCONTRANDO POSI��O DE ELEMENTOS");
		// posi��o de elemtno
		System.out.println("index of Bob: " + list.indexOf("Bob"));
		System.out.println("index of Bob: " + list.indexOf("Marco"));// retorna -1, pois n�o se encontra na lista;

		System.out.println("--------------------");
		// filtra lista que come�a com A. para isso deve declarar uma nova lista.
		System.out.println("FILTRAR A LISTA QUE COME�A COM LETRA 'A' ");

		/*
		 * 1 PASSO) DECLARAR NOVA LISTA E O SEU TIPO E SEU NOME; NO EXEMPLO ABAIXO
		 * DECLARAMOS UMA LISTA DO TIPO STRING COM NOME "RESULT"; 
		 * 2 PASSO) PEGAR A LISTA
		 * list, e filtrar somente os elementos que com come�am com "A" e devolver esses
		 * elementos para a lista que vc acabou de criar; 
		 * 3 Passo)pega a Lista "list" e
		 * converte para Stream. A partir desse String chama a fun��o Filter. O filter
		 * recebe o predicado x -> x.charAt(0) == 'A'. O filter devolve uma stream
		 * filtrado conforme o predicado que voc� determinou. Mas, esse Stream n�o �
		 * compat�vel com "list", e agora, pegamos o Stream e convertermos para list.
		 * Para essa convers�o, chamamos a fun��o collect(collectors.toList())
		 */

		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}

		System.out.println("--------------------");
		/*
		 * /PEGAR O PRIMEIRO ELEMENTO QUE COME�A COM A LETRA "a" 
		 * 1 PASSO) dECLARA UMA
		 * VARIAVEL STRING No exemplo abaixo colocamos a vari�vel "name"; 
		 * 2 PASSO) UTILIZAR a "list" e a fun��o lambda Stream() e sua fun��o filter com predicado;
		 * em seguida, vamos utilizar o findFirst e chamar a fun��o or Else(null);
 		 * 
		 */
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		String letraj = list.stream().filter(x -> x.charAt(0) == 'j').findFirst().orElse(null);
		System.out.println(letraj);
	}

}
