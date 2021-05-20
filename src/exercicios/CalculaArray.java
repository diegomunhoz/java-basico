package exercicios;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Classe para efetuar calculos em ArrayList do tipo inteiro
 * 
 * @author Diego Munhoz
 * @since 25/02/2021
 */
public class CalculaArray {

	private ArrayList<Integer> numeros;
	private int maior;
	private int menor;
	private int somaElementos;

	public CalculaArray() {
		numeros = new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		numeros.add(7);
		numeros.add(8);
		numeros.add(9);
		numeros.add(10);
		maiorElemento();
		menorElemento();
		ordernarListaCrescente();
		ordernarListaDecrescente();
		mediaElementos();
		somaMaiorMenorElemento();
	}

	private void maiorElemento() {
		Collections.reverse(numeros);// ordena a lista de forma decrescente
		System.out.println(numeros.get(0));
	}

	private void menorElemento() {
		Collections.sort(numeros);// ordena a lista de forma crescente
		System.out.println(numeros.get(0));
	}
	
	private void ordernarListaCrescente() {
		Collections.sort(numeros);// ordena a lista de forma crescente
		for (Integer num : numeros) {
			System.out.print(num + "  ");
		}
		System.out.println("");
	}

	private void ordernarListaDecrescente() {
		Collections.reverse(numeros);// ordena a lista de forma decrescente
		for (Integer num : numeros) {
			System.out.print(num + "  ");
		}
		System.out.println("");
	}

	private void mediaElementos() {
		int somaElementos = 0;
		for (Integer num : numeros) {
			somaElementos += num;
		}
		System.out.println(somaElementos / 10);
	}
	
	private void somaMaiorMenorElemento() {
		Collections.sort(numeros);
		System.out.println(numeros.get(numeros.size() - 1) + numeros.get(0));
	}
	
	public static void main(String[] args) {
		new CalculaArray();
	}

}
