package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber o nome, celular e cidade do usuario e exibir no console
 * 
 * @author Diego Munhoz
 * @since 05/02/2021
 */
public class Exercicio06 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// declarando as variáveis
		String nome, celular, cidade;
		
		// recebendo os valores do usuario
		nome = JOptionPane.showInputDialog("Informe o nome");
		cidade = JOptionPane.showInputDialog("Informe a cidade");
		celular = JOptionPane.showInputDialog("Informe o celular");
		
		// exibindo os dados no console
		System.out.println("Conteúdo da variável NOME: " + nome);
		System.out.println("Conteúdo da variável CIDADE: " + cidade);
		System.out.println("Conteúdo da variável CELULAR: " + celular);

	}

}
