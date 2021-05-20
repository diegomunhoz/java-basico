package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber do usuario o sal�rio e vale-refei��o e exibir no
 * console
 * 
 * @author Diego Munhoz
 * @since 05/02/2021
 */
public class Exercicio08 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando as vari�veis
		double salario, valeRefeicao;

		// recebendo os dados do usuario
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio"));
		valeRefeicao = Double.parseDouble(JOptionPane.showInputDialog("Informe o vale-refei��o"));

		// exibindo os dados no console
		System.out.println("Conte�do da vari�vel SALARIO: " + salario);
		System.out.println("Conte�do da vari�vel VALE-REFEI��O: " + valeRefeicao);
	}

}
