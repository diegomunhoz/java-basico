package exemplo08;

import javax.swing.JOptionPane;

/**
 * Classe para demonstrar a utiliza��o do componente JOptionPane acessando
 * atributos est�ticos
 * 
 * @author Diego Munhoz
 * @since 23/02/2021
 */
public class TestaJoptionPane {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// utilizando o JOptionPane com o construtor para exibi��o de mensagem de erro
//		JOptionPane.showMessageDialog(null, "Conte�do", "T�tulo", 0); // 0 - c�digo do �cone de erro

		// utilizando o JOptionPane com o construtor para exibi��o de mensagem de informa��o
		JOptionPane.showMessageDialog(null, Mensagem.sucessoIncluido, Titulo.cadastroUsuario, 1); // 1 - c�digo do �cone de info

		// utilizando o JOptionPane com o construtor para exibi��o de mensagem de advert�ncia
//		JOptionPane.showMessageDialog(null, "Conte�do", "T�tulo", 2); // 2 - c�digo do �cone de advert�ncia
		
		// utilizando o JOptionPane com o construtor para exibi��o de mensagem de d�vida
//		JOptionPane.showMessageDialog(null, "Conte�do", "T�tulo", 3); // 3 - c�digo do �cone de interroga��o

	}

}
