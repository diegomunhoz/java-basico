package exemplo03;

/**
 * Programa para demonstrar o decremento de valores
 * 
 * @author Diego Munhoz
 * @since 10/02/2021
 */
public class ExemploDecremento {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as variáveis
		int numero;

		// atribuindo valores nas variáveis
		numero = 1;

		System.out.println(numero);// exibindo o valor 1

		numero = numero - 1;// decremento

		System.out.println(numero);// exibindo o valor 0

		// inicializando a variavel
		numero = 10;

		numero--;// decremento

		System.out.println(numero);// exibindo o valor 9

		numero--;// decremento
		numero--;// decremento

		System.out.println(numero);// exibindo o valor 7

	}

}
