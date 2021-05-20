package exemplo10;

import javax.swing.JOptionPane;

/**
 * Classe para demonstrar a utilização de exceções em Java
 * @author Diego Munhoz 
 * @since 23/02/2021
 */
public class TestaUsuario {

	public void receberDados() {
		if (Valida.isStringVazio(JOptionPane.showInputDialog(Mensagem.informeNome))) {
			JOptionPane.showMessageDialog(null, Mensagem.nomeVazio, "Cadastro de Usuario", 0);
		}else {
			JOptionPane.showMessageDialog(null, "Nome Válido", "Cadastro de Usuario", 1);
		}
		
		if (Valida.isStringValida(JOptionPane.showInputDialog(Mensagem.informeNome))) {
			JOptionPane.showMessageDialog(null, "Nome Válido", "Cadastro de Usuario", 1);
		}else {
			JOptionPane.showMessageDialog(null, Mensagem.nomeInvalido, "Cadastro de Usuario", 0);
		}
		
		if (Valida.isNumber(JOptionPane.showInputDialog(Mensagem.informeIdade))) {
			JOptionPane.showMessageDialog(null, "Idade Válida", "Cadastro de Usuario", 1);
		}else {
			JOptionPane.showMessageDialog(null, Mensagem.idadeInvalido, "Cadastro de Usuario", 0);
		}
		
	}// fim do método
	
	public static void main(String[] args) {
		new TestaUsuario().receberDados();
	}
	
	
	
}// fim da classe
