package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular a exponenciação entre dois valores
 * 
 * @author Diego Munhoz
 * @since 05/02/2021
 */
public class Exercicio13 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando as variáveis
		double numero, expoente;
		double resultado;

		// inicializando as variáveis
		numero = 3;
		expoente = 2;

		// efetuando o calculo
		resultado = Math.pow(numero, expoente);

		// exibindo o resultado do cálculo
		JOptionPane.showMessageDialog(null,
				"Resultado do expoente de " + numero + " sobre " + expoente + " é: " + resultado);
	}

}
