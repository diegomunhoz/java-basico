package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber dois valores e calcular a média entre eles
 * 
 * @author Diego Munhoz
 * @since 10/02/2021
 */
public class Exercicio65 {

	/*
	 * Método principal para executar a classe.
	 */
	public static void main(String[] args) {

		// declarando as variaveis
		int valor1, valor2;
		double media;

		// iniciando as variaveis
		valor1 = -1;
		valor2 = -1;

		// recebendo as notas do usuario
		while ((valor1 < 0) || (valor1 > 10)) {
			valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a primeira nota"));
		}
		while ((valor2 < 0) || (valor2 > 10)) {
			valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a segunda nota"));
		}

		// calculando a media do aluno
		media = (valor1 + valor2) / 2;

		// exibindo o resultado da média para o usuario
		JOptionPane.showMessageDialog(null, "A média das notas é: " + media);

	}

}
