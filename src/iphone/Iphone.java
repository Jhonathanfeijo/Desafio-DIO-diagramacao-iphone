package iphone;

import iphone.aparelhoTelefonico.Contato;
import iphone.aparelhoTelefonico.Telefone;
import iphone.arquivos.midia.Audio;
import iphone.browser.Aba;
import iphone.browser.Safari;
import iphone.reprodutorMidia.AppleMusic;

public class Iphone {

	private final String modelo;
	private final int ano;
	private final int armazenamentoEmGB;
	public final AppleMusic appleMusic;
	public final Telefone telefone;
	public final Safari safari;

	public Iphone(int ano, String modelo, int armazenamento) {
		this.modelo = modelo;
		this.ano = ano;
		this.appleMusic = new AppleMusic();
		this.telefone = new Telefone();
		this.safari = new Safari();
		this.armazenamentoEmGB = armazenamento;
	}

	@Override
	public String toString() {
		return "Ola! Esse e o Iphone" + (this.modelo == null?  " " : this.modelo + " ") + this.armazenamentoEmGB + "GB" + ", ano de fabricacao: "
				+ this.ano;
	}

	public static void main(String[] args) {

		Iphone iphone = new Iphone(2007, null, 8);
		System.out.println(iphone);

		Audio linkinPark = new Audio("Linkin Park - Lost", 330);

		iphone.appleMusic.adicionarMusica(linkinPark);
		iphone.appleMusic.selecionarMusica(linkinPark);
		iphone.appleMusic.pausarMusica();
		iphone.appleMusic.selecionarMusica(new Audio("Chimbinha - Traição não é uma opção", 320));
		iphone.appleMusic.exibirMusicas();
		iphone.appleMusic.removerMusica(linkinPark);
		iphone.appleMusic.exibirMusicas();

		Contato contato = new Contato("Contato 1", 2023L);
		iphone.telefone.ligar(contato);
		contato.setNome(null);
		iphone.telefone.ligar(contato);
		iphone.telefone.atender();
		iphone.telefone.recusar();
		iphone.telefone.adicionarContato(contato);
		iphone.telefone.adicionarContato(new Contato("Flavio", null));
		iphone.telefone.exibirContatos();
		iphone.telefone.ligar(new Contato("Sergio", null));
		iphone.telefone.removerContato(contato);
		iphone.telefone.exibirContatos();

		iphone.safari.exibirPagina("Dio");
		iphone.safari.adicionarAba();
		System.out.println(iphone.safari.getAbaAtual());
		System.out.println(iphone.safari.getListaAbas());
		iphone.safari.adicionarAba();
		System.out.println(iphone.safari.getListaAbas());
		iphone.safari.exibirPagina("Santander");
		System.out.println(iphone.safari.getListaAbas());
	}
}
