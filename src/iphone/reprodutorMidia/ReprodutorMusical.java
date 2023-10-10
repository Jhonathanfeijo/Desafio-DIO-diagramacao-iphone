package iphone.reprodutorMidia;

import iphone.arquivos.midia.Audio;

public interface ReprodutorMusical {
	
	public void tocar();
	public void pausar();
	public void selecionarMusica(Audio musica);
	public void exibirMusicas();
}
