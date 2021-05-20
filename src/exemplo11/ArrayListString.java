package exemplo11;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Classe para demonstrar a utiliza��o de ArrayList do tipo String
 * 
 * @author Diego Munhoz
 * @since 23/02/2021
 */
public class ArrayListString {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarar e instanciar uma lista de String
		ArrayList<String> listaString = new ArrayList<String>();

		// adicionar registros na lista de string
		listaString.add("Elemento 1");
		listaString.add("Elemento 2");
		listaString.add("Elemento 3");

		// exibindo o conte�do da lista
		System.out.println(listaString.get(0));
		System.out.println(listaString.get(1));
		System.out.println(listaString.get(2));

		// adicionando em uma posi��o espec�fica
		listaString.add(1, "Elemento 1.5");

		// varrendo a lista para exibir ao usuario
		for (String obj : listaString) {
			System.out.println(obj);
		}

		// obtendo o tamanho da lista de String
		System.out.println("O tamanho da lista �: " + listaString.size());

		// pesquisando um valor espec�fico na lista
		if (listaString.contains("Elemento 1")) {
			System.out.println("Elemento encontrado!");
		} else {
			System.out.println("Elemento n�o encontrado!");
		}

		// descobrindo o indice do elemento pesquisado
		int indice = listaString.indexOf("Elemento 1");
		System.out.println("Indice: " + indice);

		// adicionando um novo elemento na lista
		listaString.add("Elemento 4");

		// obtendo o tamanho da lista de String
		System.out.println("O tamanho da lista �: " + listaString.size());

		// removendo um elemento da lista
		listaString.remove("Elemento 1.5");
		for (String string : listaString) {
			System.out.println(string);
		}

		// obtendo o tamanho da lista de String
		System.out.println("O tamanho da lista �: " + listaString.size());
	}

}
