package iphone.aparelhoTelefonico;

public class Contato {

	private String nome;
	private Long telefone;
	
	public Contato() {
	}
	
	public Contato(String nome, Long telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public Contato(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getTelefone() {
		return telefone;
	}
	
	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return this.nome != null? this.nome : this.telefone !=null? String.valueOf(this.telefone) : "Contato vazio";
	}
}
