package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir o módulo entre dois numeros
 * 
 * @author Diego Munhoz
 * @since 05/02/2021
 */
public class Exercicio14 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando as variáveis
		int valor1, valor2, resultado;

		// inicializando as variáveis
		valor1 = 10;
		valor2 = 3;

		// efetuado o calculo de módulo
		resultado = valor1 % valor2;

		// exibindo o resultado para o usuario
		JOptionPane.showMessageDialog(null,
				"O resultado do módulo de " + valor1 + " por " + valor2 + " é: " + resultado);
	}

}
