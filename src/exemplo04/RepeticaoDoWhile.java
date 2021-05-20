package exemplo04;

/**
 * Programa para demonstrar a utilização do comando de repetição Do While
 * 
 * @author Diego Munhoz
 * @since 10/02/2021
 */
public class RepeticaoDoWhile {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando variáveis
		int i;

		// inicializando a variável
		i = 10;

		do {
			System.out.println(i + " ao cubo é: " + ((i * i) * i));
			i++;
		} while (i < 10);

	}

}
