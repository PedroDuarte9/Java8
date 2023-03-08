package br.com.padrao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TestandoMetodosPadrao {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Aula Online");
		list.add("Casa do Código");
		list.add("Caelum");
		list.add("Guanabara");
		
		//Aqui estamos listando pela ordem lexicográfica(Ordem Alfabética)
		Collections.sort(list);
		System.out.println(list);
		System.out.println("");
		
		//Aqui estamos listando pelo tamanho da string
		ClasseParaComparacao cpc = new ClasseParaComparacao();
		list.sort(cpc);
		list.forEach(comparador -> {
			System.out.println(comparador);
		});
		//A classe Imprime na linha não é mais necessária.
		System.out.println(" ");
		
		
		//Excluindo a classe Imprime na linha e lendo tudo numa lambda
		list.forEach(s -> System.out.println(s));
		
		
		//Diminuindo com as lambdas
		list.sort((String s1, String s2) -> {
			if(s1.length() < s2.length()) {
				return -1;
			}
			if(s1.length() > s2.length()) {
				return 1;
			}
			return 0;
		});
		//Listando também pelo tamanho da String
		System.out.println(list);
		
		//Diminuindo ainda mais o Lambda usando um método compare da classe Integer
		list.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
	}

}

