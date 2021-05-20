package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar entrada de dados fornecido pelo usuario
 * 
 * @author Diego Munhoz
 * @since 05/02/2021
 */
public class EntradaDados {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando variáveis
		String nome;

		// atribuir valor para a variável nome informado pelo usuario
		nome = JOptionPane.showInputDialog("Informe o nome");

		// exibindo dados no console
		System.out.println("Seu nome é: " + nome + ".");

	}

}
