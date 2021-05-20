package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber do usuario o salário e vale-refeição e exibir no
 * console
 * 
 * @author Diego Munhoz
 * @since 05/02/2021
 */
public class Exercicio08 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando as variáveis
		double salario, valeRefeicao;

		// recebendo os dados do usuario
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário"));
		valeRefeicao = Double.parseDouble(JOptionPane.showInputDialog("Informe o vale-refeição"));

		// exibindo os dados no console
		System.out.println("Conteúdo da variável SALARIO: " + salario);
		System.out.println("Conteúdo da variável VALE-REFEIÇÃO: " + valeRefeicao);
	}

}
