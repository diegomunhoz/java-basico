/**
 * 
 */
package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para buscar um valor especifico no vetor String
 * @author Diego Munhoz
 * @since 11/02/2021
 */
public class BuscarValorVetorString {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// declarando o vetor
		String vetor[];
		
		// inicializando o vetor e definindo o seu tamanho
		vetor= new String[3];
		
		// variavel auxiliar para buscar um registro
		String nome = JOptionPane.showInputDialog("Informe o que quer buscar");
		
		// valorizando o vetor com dados informados pelo usuario
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = JOptionPane.showInputDialog("Informe um nome");
		}
		
		// varrendo o vetor para verificar os registros armazenados
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].equals(nome)) {
				System.out.println("Encontrei na posição " + i);
			}
		}

	}

}
