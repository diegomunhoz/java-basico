package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para valores negativos informado pelo usuario
 * 
 * @author Diego Munhoz
 * @since 10/02/2021
 */
public class Exercicio72 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as variaveis
		int contador;
		int valor;
		
		// inicializando a variavel de contagem
		contador = 0;

		// usuario declarando 10 valores
		for (int i = 1; i < 11; i++) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
			if (valor < 0) {
				contador++;
			}
		}

		// exibindo o resultado para o usuario
		JOptionPane.showMessageDialog(null, "Numeros negativos digitados: " + contador);
	}

}
