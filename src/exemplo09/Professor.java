package exemplo09;

/**
 * Classe para armazenar os atributos de professor herdando os dados de
 * funcionario (heran�a)
 * 
 * @author Diego Munhoz
 * @since 23/02/2021
 */
public class Professor extends Funcionario implements IntefaceFuncionario {

	// atributos do objeto Professor
	private String materia;

	// m�todos para acessar o atributo
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	// m�todo para exibir os dados
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Mat�ria: " + materia);
	}

	@Override
	public void salvar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void consultar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar() {
		// TODO Auto-generated method stub
		
	}

}// fim da classe
