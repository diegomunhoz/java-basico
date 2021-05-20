package exemplo07;

/**
 * Programa para testar o objeto pessoa
 * 
 * @author Diego Munhoz
 * @since 17/02/2021
 */
public class TestaPessoa {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarar e instanciar o objeto pessoa
		Pessoa joao = new Pessoa();

		// atribuindo os valores ao objeto joao
		joao.setNome("João Almeida de Souza");

		// criando e instanciando o objeto de data
		Data dataNascimento = new Data();

		// inicializando a data do objeto joao
		dataNascimento.setDia(10);
		dataNascimento.setMes(02);
		dataNascimento.setAno(1985);

		// atribundi os valores de data para o objeto joao
		joao.setDataNascimento(dataNascimento);

		//atribuindo o valor do salario do joao
		joao.setSalario(2500.00);
		
		// exibindo os dados do objeto joao
		System.out.println("Nome: " + joao.getNome());
		System.out.println("Data de Nascimento: " + joao.getDataNascimento());
		System.out.println(joao.getDataNascimento().getFaixaEtaria());
		System.out.println(joao.getFaixaSalarial());
	}

}
