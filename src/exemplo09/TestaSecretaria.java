package exemplo09;

/**
 * Classe para instanciar o objeto Secretaria e exibir os seus dados
 * @author Diego Munhoz
 * @since 23/02/2021
 */
public class TestaSecretaria {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// instanciando o objeto do tipo Secretaria
		Secretaria maria = new Secretaria();
		maria.setNome("Maria de Paula Souza");
		maria.setCpf("321.321.321-32");
		maria.setSalario(950.00);
		maria.setRamal(123);
		
		maria.mostrarDados();

	}

}
