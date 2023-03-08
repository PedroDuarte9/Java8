package br.com.padrao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
		
		//Aqui estamos listando pelo tamanho da string
		ClasseParaComparacao cpc = new ClasseParaComparacao();
		list.sort(cpc);
		list.forEach(comparador -> {
			System.out.println(comparador);
		});
		
	}

}
