package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar a utilização de vetor double em Java
 * 
 * @author Diego Munhoz
 * @since 11/02/2021
 */
public class VetorDouble {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando o vetor
		double vetor[];
		
		// inicializando e informando o tamanho do vetor - 5 posições
		vetor = new double[5];
		
		// recebendo os dados do usuario para valorizar o vetor
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));
		}
		
		// exibindo os dados gravados no vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

	}

}
