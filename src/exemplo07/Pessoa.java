package exemplo07;

/**
 * Classe para armazenar os atributos e m�todos do objeto Pessoa
 * 
 * @author Diego Munhoz
 * @since 17/02/2021
 */
public class Pessoa {

	// declarando os atributos da pessoa
	private String nome;
	private Data dataNascimento;
	private double salario;

	// m�todos para acessar os atributos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Data getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Data dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// m�todo para verificar se o usuario ganha abaixo ou acima do salario m�nimo
	public String getFaixaSalarial() {
		if (salario >= 1163.55) {
			return "Acima do sal�rio m�nimo";
		} else {
			return "Abaixo do sal�rio m�nimo";
		}

	}

}
