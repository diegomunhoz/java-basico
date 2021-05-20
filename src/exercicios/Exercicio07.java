package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber do usuario a idade, altura e peso e exibir no console
 * @author Diego Munhoz
 * @since 05/02/2021
 */
public class Exercicio07 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// declarando as variáveis
		int idade;
		double altura, peso;
		
		// recebendo os dados do usuario
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso"));
		
		// exibindo os dados no console
		System.out.println("Dados da variável IDADE: " + idade);
		System.out.println("Dados da variável ALTURA: " + altura);
		System.out.println("Dados da variável PESO: " + peso);
	
	}

}
