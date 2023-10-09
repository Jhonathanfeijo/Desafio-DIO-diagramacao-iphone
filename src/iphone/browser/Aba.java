package iphone.browser;

public class Aba {
	

	private String site;

	public Aba() {
		this.site = "Pagina inicial";
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	@Override
	public String toString() {
		return this.site;
	}
}
