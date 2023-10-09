package iphone.reprodutorMidia;

import java.util.HashMap;
import java.util.Map;

import iphone.arquivos.midia.Audio;

public class AppleMusic implements ReprodutorMusical {

	Map<String, Audio> musicas;
	private boolean tocando;

	public AppleMusic() {
		musicas = new HashMap<String, Audio>();
		this.tocando = false;
	}

	public void adicionarMusica(Audio audio) {
		if (audio == null)
			throw new RuntimeException("Audio nulo");
		musicas.put(audio.getNome(), audio);
	}

	public void removerMusica(Audio audio) {
		musicas.entrySet().stream().filter(entry -> entry.getValue().equals(audio))
				.map(entry -> musicas.remove(audio.getNome()));
	}

	@Override
	public void tocarMusica() {
		this.tocando = true;
		System.out.println("Tocando musica");
	}

	@Override
	public void pausarMusica() {
		this.tocando = false;
		System.out.println("Musica pausada");
	}

	@Override
	public void selecionarMusica(Audio musica) {
		if (musica == null)
			throw new RuntimeException("Não foi possível tocar essa musica");
		if (musicas.containsKey(musica.getNome())) {
			System.out.println("Musica selecionada " + musica.getNome());
			tocarMusica();
		} else
			System.out.println("Essa musica nao se encontra no seu repositorio");
	}

	public void statusAppleMusica() {
		if (tocando)
			System.out.println("A musica esta tocando");
		else
			System.out.println("A musica nao esta tocando");
	}

	@Override
	public void exibirMusicas() {
		if (this.musicas.isEmpty())
			System.out.println("Nao ha musicas em seu repositorio...");
		else {
			System.out.println("Listagem de musica");
			musicas.entrySet().forEach(entry -> System.out.println(entry.getKey()));
		}
	}
}
