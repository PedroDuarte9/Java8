package br.com.padrao;

import java.util.ArrayList;
import java.util.Collections;
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
		//Usando um default methods
		System.out.println(" ");
		Consumer<String> consumidor = new ImprimeNaLinha();
		list.forEach(consumidor);
		
	}

}

class ImprimeNaLinha implements Consumer<String> {

	@Override
	public void accept(String s) {
		System.out.println(s);
		
	}
}