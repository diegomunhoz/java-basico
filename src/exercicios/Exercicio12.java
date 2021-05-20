package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber dois valores do usuario e exibir a divis�o dos valores
 * 
 * @author Diego Munhoz
 * @since 05/02/2021
 */
public class Exercicio12 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando as vari�veis
		double num1, num2, res;

		// recebendo os valores do usuario
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));

		// efetuando o calculo
		res = num1 / num2;

		// exibindo o resultado para o usuario
		JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " + res, "Resultado do calculo", 1);

	}

}
