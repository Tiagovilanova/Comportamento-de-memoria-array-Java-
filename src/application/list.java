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
		// inserir novo elemento na posição dois na lista

		list.add(2, "Marco");

		// tamanho da lista
		System.out.println(list.size());
		for (String x : list) {
			System.out.println(x);
		}
		/*
		 * remover elemento list.remove("Anna"); nesse caso, mesmo sendo outra instância
		 * de string o programa consegue remover por comparação
		 */

		System.out.println("--------------------");
		System.out.println("Remoção pela posição");
		list.remove(1);
		System.out.println("Remoção por predicado");
		list.removeIf(x -> x.charAt(0) == 'M'); // remover que começa com a letra M. é uma função lambida que se chama
												// predicado, pois retorna em verdadeiro e falso
		/*
		 * INTERPRETAÇÃO DESSA FUNÇÃO LÂMBIDA: pega esse valor do tipo String, e em
		 * seguida retorne se esse x.charAt(0) é igual a 'M'
		 */
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("--------------------");
		System.out.println("ENCONTRANDO POSIÇÃO DE ELEMENTOS");
		// posição de elemtno
		System.out.println("index of Bob: " + list.indexOf("Bob"));
		System.out.println("index of Bob: " + list.indexOf("Marco"));// retorna -1, pois não se encontra na lista;

		System.out.println("--------------------");
		// filtra lista que começa com A. para isso deve declarar uma nova lista.
		System.out.println("FILTRAR A LISTA QUE COMEÇA COM LETRA 'A' ");

		/*
		 * 1 PASSO) DECLARAR NOVA LISTA E O SEU TIPO E SEU NOME; NO EXEMPLO ABAIXO
		 * DECLARAMOS UMA LISTA DO TIPO STRING COM NOME "RESULT"; 
		 * 2 PASSO) PEGAR A LISTA
		 * list, e filtrar somente os elementos que com começam com "A" e devolver esses
		 * elementos para a lista que vc acabou de criar; 
		 * 3 Passo)pega a Lista "list" e
		 * converte para Stream. A partir desse String chama a função Filter. O filter
		 * recebe o predicado x -> x.charAt(0) == 'A'. O filter devolve uma stream
		 * filtrado conforme o predicado que você determinou. Mas, esse Stream não é
		 * compatível com "list", e agora, pegamos o Stream e convertermos para list.
		 * Para essa conversão, chamamos a função collect(collectors.toList())
		 */

		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}

		System.out.println("--------------------");
		/*
		 * /PEGAR O PRIMEIRO ELEMENTO QUE COMEÇA COM A LETRA "a" 
		 * 1 PASSO) dECLARA UMA
		 * VARIAVEL STRING No exemplo abaixo colocamos a variável "name"; 
		 * 2 PASSO) UTILIZAR a "list" e a função lambda Stream() e sua função filter com predicado;
		 * em seguida, vamos utilizar o findFirst e chamar a função or Else(null);
 		 * 
		 */
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		String letraj = list.stream().filter(x -> x.charAt(0) == 'j').findFirst().orElse(null);
		System.out.println(letraj);
	}

}
