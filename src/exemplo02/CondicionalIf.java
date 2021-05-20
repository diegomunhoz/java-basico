package exemplo02;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar o comando IF
 * @author Diego Munhoz
 * @since 08/02/2021
 */
public class CondicionalIf {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		
		// declarando vari�veis
		double imc, altura, peso;
		
		// capturando os dados do usuario
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe o altura"));
		
		// calculando o IMC do usuario
		imc = peso / (Math.pow(altura, 2));
		
		// exibir o resultado do IMC
		if (imc < 18.5) {
			JOptionPane.showMessageDialog(null, "Abaixo do peso!");
		}
		
		if ((imc >= 18.5) && (imc <= 24.9)) {
			JOptionPane.showMessageDialog(null, "Peso ideal!");
		}

	}

}
