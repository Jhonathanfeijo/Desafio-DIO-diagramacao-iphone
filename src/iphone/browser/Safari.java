package iphone.browser;

import java.util.ArrayList;
import java.util.List;

public class Safari implements NavegadorInterface {

	private List<Aba> listaAbas;
	private Aba abaAtual;

	public List<Aba> getListaAbas() {
		return listaAbas;
	}

	public Aba getAbaAtual() {
		return abaAtual;
	}

	public Safari() {
		this.listaAbas = new ArrayList<Aba>();
	}

	@Override
	public void selecionarAba(Aba aba) {
		if (listaAbas.contains(aba))
			abaAtual = aba;
	}

	@Override
	public void removerAba(Aba aba) {
		if (listaAbas.contains(aba))
			listaAbas.remove(aba);
	}

	@Override
	public void adicionarAba() {
		this.abaAtual = new Aba();
		this.listaAbas.add(this.abaAtual);
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando a pagina...");
	}

	@Override
	public void exibirPagina(String site) {
		if (this.abaAtual == null)
			adicionarAba();
		this.abaAtual.setSite(site);
		System.out.println("Acessando " + site + "...");
	}
}
