package iphone.arquivos.midia;

import java.time.format.DateTimeFormatter;

import iphone.arquivos.Arquivo;

public class Audio extends Arquivo {

	private int duracaoAudioSegundos;

	public Audio(String nomeAudio, int duracaoAudioSegundos) {
		super(nomeAudio, "mp3");
		this.duracaoAudioSegundos = duracaoAudioSegundos;
	}

	public String duracaoAudio() {
		int minutos = duracaoAudioSegundos / 60;
		int segundos = duracaoAudioSegundos % 60;

		// Formate os minutos e segundos em uma string no formato desejado
		String duracaoFormatada = String.format("%02d:%02d", minutos, segundos);

		return duracaoFormatada;
	}

	@Override
	public String toString() {
		return "Nome: " + this.getNome().concat(".") + this.getFormato() + " - Data de download: " + this.getDataDownload().format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm"))
				+ " - Duracao " + this.duracaoAudio();
	}
}
