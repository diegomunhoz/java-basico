package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demosntrar exibi��o de dados para o usuario
 * 
 * @author Diego Munhoz
 * @since 05/02/2021
 */
public class SaidaDados {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando vari�veis
		double num1, num2, res;

		// atribuindo valores para as vari�veis
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro numero"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero"));

		// efetuando a opera��o de multiplica��o
		res = num1 * num2;

		// exibindo o resultado para o usuario
		JOptionPane.showMessageDialog(null, "Primeiro valor digitado: " + num1 + "\n" +
											"Segundo valor digitado: " + num2 + "\n" +
											"Resultado da opera��o: " + res);
		
//		JOptionPane.showMessageDialog(null, "2 + 2 = 4", "Resultado da Opera��o", 0);//erro
//		JOptionPane.showMessageDialog(null, "2 + 2 = 4", "Resultado da Opera��o", 1);//informa��o
//		JOptionPane.showMessageDialog(null, "2 + 2 = 4", "Resultado da Opera��o", 2);//advertencia
//		JOptionPane.showMessageDialog(null, "2 + 2 = 4", "Resultado da Opera��o", 3);//interroga��o
	}

}
