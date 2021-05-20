package exemplo02;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar o comando If Else encadeado
 * 
 * @author Diego Munhoz
 * @since 08/02/2021
 */
public class CondicionalIfElseEncadeada {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando as variáveis
		double imc, altura, peso;

		// recebendo do usuario as informações
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));

		// calculando o valor do IMC do usuario
		imc = peso / (Math.pow(altura, 2));

		// exibindo as informações para o usuário
		if (imc < 18.5) {
			JOptionPane.showMessageDialog(null, "Abaixo do peso!");
		} else if ((imc >= 18.5) && (imc <= 24.9)) {
			JOptionPane.showMessageDialog(null, "Peso ideal!");
		} else if ((imc >= 25) && (imc <= 29.9)) {
			JOptionPane.showMessageDialog(null, "Acima do peso!");
		} else if ((imc >= 30) && (imc <= 34.9)) {
			JOptionPane.showMessageDialog(null, "Obesidade nivel 1!");
		} else {
			JOptionPane.showMessageDialog(null, "Obesidade mórbida!");
		}

	}

}
