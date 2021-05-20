package exemplo04;

/**
 * Programa para demonstrar a utiliza��o do comando de repeti��o Do While
 * 
 * @author Diego Munhoz
 * @since 10/02/2021
 */
public class RepeticaoDoWhile {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando vari�veis
		int i;

		// inicializando a vari�vel
		i = 10;

		do {
			System.out.println(i + " ao cubo �: " + ((i * i) * i));
			i++;
		} while (i < 10);

	}

}
