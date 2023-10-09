package iphone.reprodutorMidia;

import iphone.arquivos.midia.Audio;

public interface ReprodutorMusical {
	
	public void tocarMusica();
	public void pausarMusica();
	public void selecionarMusica(Audio musica);
	public void exibirMusicas();
}
