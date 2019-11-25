
public class Pessoa {
	private String nome;
	private String cpf;
	private int idade;
	
	public Pessoa() {
		super();		
	}

	public void cadastroPessoa(String nome, String cpf, int idade) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [\nnome=" + nome + ",\ncpf=" + cpf + ",\nidade=" + idade + "\n]";
	};
	
}
