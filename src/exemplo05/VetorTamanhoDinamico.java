package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar vetor com o usuario informando o seu tamanho
 * @author Diego Munhoz
 * @since 11/02/2021
 */
public class VetorTamanhoDinamico {

	/* 
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// declarando o vetor
		int vetor[];
		
		// variável auxiliar informada pelo usuario para definir o tamanho do vetor
		int tamanho;
		
		// usuario informando o tamanho do vetor
		tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor"));
		
		// inicializar e informar o tamanho do vetor
		vetor = new int[tamanho];
		
		// recebendo do usuario os valores a serem gravados no vetor
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		}
		
		// exibir os dados gravados no vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

	}

}
