package exemplo10;

/**
 * Classe responsável por armazenar os métodos de validação de dados
 * 
 * @author Diego Munhoz
 * @since 23/02/2021
 */
public class Valida {

	// método para verificar String vazia
	public static boolean isStringVazio(String args) {
		// COMANDO TRIM = tira os espaços da variavel String
		if (args.trim().equals("")) {
			return true;
		} else {
			return false;
		}
	}// fim do método

	// método para verificar String válida
	public static boolean isStringValida(String args) {
		if (!args.matches("[0-9]*")) {
			return true;
		} else {
			return false;
		}
	}// fim do método

	// método para verificar se é numero
	public static boolean isNumber(String args) {
		try {
			int numero = Integer.parseInt(args);
			return true;
		} catch (Exception e) {
			return false;
		}

	}// fim do método

}
