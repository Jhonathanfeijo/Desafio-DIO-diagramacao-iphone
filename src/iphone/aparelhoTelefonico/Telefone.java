package iphone.aparelhoTelefonico;

import java.util.ArrayList;
import java.util.List;

public class Telefone implements AgendaCelular {
	List<Contato> listaContatos;

	public Telefone() {
		this.listaContatos = new ArrayList<Contato>();
	}

	public List<Contato> getListaContatos() {
		return listaContatos;
	}

	@Override
	public void atender() {
		System.out.println("Ligacao atendida...");
	}

	@Override
	public void recusar() {
		System.out.println("Ligacao recusada...");
	}

	@Override
	public void ligar(Contato contato) {
		if (contato != null && contato.getTelefone() != null)
			System.out.println("Ligando para " + contato + "...");
		else
			System.out.println("Contado invalido para realizar ligacoes");
	}

	@Override
	public void iniciarCorreioVoz(Contato contato) {
		System.out.println("Enviando correio de voz para " + contato + "...");
	}

	@Override
	public void removerContato(Contato contato) {
		if (contato == null)
			throw new RuntimeException("Contato nulo");
		if (listaContatos.contains(contato)) {
			listaContatos.remove(contato);
			System.out.println("Contato removido!");
		}else
			System.out.println("Contato não foi encontrado");
	}

	@Override
	public void adicionarContato(Contato contato) {
		if (contato == null || (contato.getNome() == null && contato.getTelefone() == null))
			throw new RuntimeException("Contato nulo");
		listaContatos.add(contato);
		System.out.println("Contato adicionado!");
	}

	@Override
	public void exibirContatos() {
		System.out.println("Lista de contatos");
		for(Contato contato : listaContatos)
			System.out.println(contato);
	}

}
