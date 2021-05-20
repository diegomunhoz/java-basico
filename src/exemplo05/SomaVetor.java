package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar a soma de um vetor do tipo inteiro
 * @author Diego Munhoz
 * @since 11/02/2021
 */
public class SomaVetor {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// declarando o vetor
		int vetor[];
		
		//declarando variavel auxiliar para somar o vetor
		int soma;
		
		// incializar o vetor e definir o seu tamanho
		vetor = new int[5];
		
		// inicializando a variavel de soma
		soma = 0;
		
		// valorizando as posições do vetor com os dados informados pelo usuario
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		}
		
		// somando o vetor com auxilio do comando FOR
		for (int i = 0; i < vetor.length; i++) {
			soma = soma + vetor[i];
		}
		
		// exibindo o resultado da soma do vetor
		System.out.println(soma);

	}

}
