package exemplo03;

/**
 * Programa para demonstrar a utiliza��o de Incremento e Decremento de valores
 * 
 * @author Diego Munhoz
 * @since 10/02/2021
 */
public class ExemploIncremento {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando as vari�veis
		int numero;

		// atribuindo valores a variavel
		numero = 1;

		System.out.println(numero);// exibindo o valor 1

		numero = numero + 1;// incremento

		System.out.println(numero);// exibindo o valor 2

		numero++;// incremento

		System.out.println(numero);// exibindo o valor 3

		System.out.println(numero++);// exibindo o valor 3

		System.out.println(numero);// exibindo o valor 4

		System.out.println(++numero);// exibindo o valor 5

	}

}
