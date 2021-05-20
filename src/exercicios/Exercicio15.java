package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber um valor do usuario e exibir o seu antecessor
 * 
 * @author Diego Munhoz
 * @since 05/02/2021
 */
public class Exercicio15 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando as variáveis
		int valor, resultado;

		// recebendo o valor do usuario
		valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));

		// calculando seu antecessor
		resultado = valor - 1;

		// exibindo o resultado para o usuario
		JOptionPane.showMessageDialog(null, "O antecessor de " + valor + " é: " + resultado);

	}

}
