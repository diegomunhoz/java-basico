package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar conversão de dados do tipo String para double
 * 
 * @author Diego Munhoz
 * @since 05/02/2021
 */
public class ConverterDadosDouble {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando variáveis
		double valor1;
		double valor2;
		double resultado;

		// atribuindo valores para a variável informado pelo usuario
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));

		// efetuando o calculo de divisão
		resultado = valor1 / valor2;

		// exibindo o resultado da divisão no console
		System.out.println("O resultado da divisão é: " + resultado);

	}

}
