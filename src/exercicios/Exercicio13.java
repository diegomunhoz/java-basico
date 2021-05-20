package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular a exponencia��o entre dois valores
 * 
 * @author Diego Munhoz
 * @since 05/02/2021
 */
public class Exercicio13 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando as vari�veis
		double numero, expoente;
		double resultado;

		// inicializando as vari�veis
		numero = 3;
		expoente = 2;

		// efetuando o calculo
		resultado = Math.pow(numero, expoente);

		// exibindo o resultado do c�lculo
		JOptionPane.showMessageDialog(null,
				"Resultado do expoente de " + numero + " sobre " + expoente + " �: " + resultado);
	}

}
