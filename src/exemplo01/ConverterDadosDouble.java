package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar convers�o de dados do tipo String para double
 * 
 * @author Diego Munhoz
 * @since 05/02/2021
 */
public class ConverterDadosDouble {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando vari�veis
		double valor1;
		double valor2;
		double resultado;

		// atribuindo valores para a vari�vel informado pelo usuario
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));

		// efetuando o calculo de divis�o
		resultado = valor1 / valor2;

		// exibindo o resultado da divis�o no console
		System.out.println("O resultado da divis�o �: " + resultado);

	}

}
