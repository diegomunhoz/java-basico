package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para representar concatena��o de texto em uma vari�vel String
 * @author Diego Munhoz
 * @since 08/02/2021
 */
public class ConcatenarTexto {

	/* 
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// declarando as vari�veis
		String auxiliar;
		
		auxiliar = "Bem vindo,";
		auxiliar += " meus queridos";
		auxiliar += " a aula de demonstra��o";
		auxiliar += " com vari�vel String!";
		
		JOptionPane.showMessageDialog(null, auxiliar);
		
		

	}

}
