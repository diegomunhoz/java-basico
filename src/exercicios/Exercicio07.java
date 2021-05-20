package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber do usuario a idade, altura e peso e exibir no console
 * @author Diego Munhoz
 * @since 05/02/2021
 */
public class Exercicio07 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// declarando as vari�veis
		int idade;
		double altura, peso;
		
		// recebendo os dados do usuario
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso"));
		
		// exibindo os dados no console
		System.out.println("Dados da vari�vel IDADE: " + idade);
		System.out.println("Dados da vari�vel ALTURA: " + altura);
		System.out.println("Dados da vari�vel PESO: " + peso);
	
	}

}
