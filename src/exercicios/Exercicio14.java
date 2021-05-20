package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir o m�dulo entre dois numeros
 * 
 * @author Diego Munhoz
 * @since 05/02/2021
 */
public class Exercicio14 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando as vari�veis
		int valor1, valor2, resultado;

		// inicializando as vari�veis
		valor1 = 10;
		valor2 = 3;

		// efetuado o calculo de m�dulo
		resultado = valor1 % valor2;

		// exibindo o resultado para o usuario
		JOptionPane.showMessageDialog(null,
				"O resultado do m�dulo de " + valor1 + " por " + valor2 + " �: " + resultado);
	}

}
