package iphone.aparelhoTelefonico;

public interface AparelhoTelefonico {

	public void atender();
	public void recusar();
	public void ligar(Contato contato);
	public void iniciarCorreioVoz(Contato contato);
}
