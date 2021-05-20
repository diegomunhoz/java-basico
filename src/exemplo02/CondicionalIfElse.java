package exemplo02;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar o uso do comando If Else
 * 
 * @author Diego Munhoz
 * @since 08/02/2021
 */
public class CondicionalIfElse {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando as variáveis
		double imc, altura, peso;

		// capturando os dados do usuario
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe o altura"));

		// calculando o valor do IMC do usuario
		imc = peso / (Math.pow(altura, 2));

		// demonstrando o resultado para o usuario
		if (imc < 18.5) {
			JOptionPane.showMessageDialog(null, "Abaixo do peso!");
		} else {
			JOptionPane.showMessageDialog(null, "Peso ideal!");
		}

	}

}
