package iphone.aparelhoTelefonico;

public interface AgendaCelular extends AparelhoTelefonico{

	public void adicionarContato(Contato contato);
	public void removerContato(Contato contato);
	public void exibirContatos();
}
