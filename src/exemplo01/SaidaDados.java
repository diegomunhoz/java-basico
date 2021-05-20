package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demosntrar exibição de dados para o usuario
 * 
 * @author Diego Munhoz
 * @since 05/02/2021
 */
public class SaidaDados {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando variáveis
		double num1, num2, res;

		// atribuindo valores para as variáveis
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro numero"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero"));

		// efetuando a operação de multiplicação
		res = num1 * num2;

		// exibindo o resultado para o usuario
		JOptionPane.showMessageDialog(null, "Primeiro valor digitado: " + num1 + "\n" +
											"Segundo valor digitado: " + num2 + "\n" +
											"Resultado da operação: " + res);
		
//		JOptionPane.showMessageDialog(null, "2 + 2 = 4", "Resultado da Operação", 0);//erro
//		JOptionPane.showMessageDialog(null, "2 + 2 = 4", "Resultado da Operação", 1);//informação
//		JOptionPane.showMessageDialog(null, "2 + 2 = 4", "Resultado da Operação", 2);//advertencia
//		JOptionPane.showMessageDialog(null, "2 + 2 = 4", "Resultado da Operação", 3);//interrogação
	}

}
