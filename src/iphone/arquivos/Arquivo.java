package iphone.arquivos;

import java.time.LocalDateTime;

public class Arquivo {

	private String nome;
	private LocalDateTime dataDownload;
	private String formato;

	public Arquivo(String nome,  String formato) {
		this.nome = nome;
		this.formato = formato;
		this.dataDownload = LocalDateTime.now();
	}

	public String getFormato() {
		return formato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDateTime getDataDownload() {
		return dataDownload;
	}
}
