package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular valor da conta entre tres amigos
 * 
 * @author Diego Munhoz
 * @since 05/02/2021
 */
public class Exercicio28 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando as variáveis
		int valorCarlos = Integer.MAX_VALUE; 
		int valorAndre;
		double valorFelipe, valorTotalConta, valorDivido;

		// recebendo o valor da conta do usuario
		valorTotalConta = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da conta"));

		// efetuando o calculo da divisão da conta
		valorDivido = valorTotalConta / 3;

		// atribuindo o valor para cada amigo
		valorCarlos = (int) valorDivido;
		valorAndre = (int) valorDivido;
		valorFelipe = valorTotalConta - (valorCarlos + valorAndre);

		// exibindo o resultado para o usuario
		JOptionPane.showMessageDialog(null, "Valor da conta para Carlos: " + valorCarlos + "\n" +
											"Valor da conta para Andre : " + valorAndre + "\n" + 
											"Valor da conta para Felipe: " + valorFelipe);
	}

}
