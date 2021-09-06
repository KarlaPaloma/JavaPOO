package ClasseMamiferos;

public abstract class Mamifero {

	private String olhos;
	private String patas;
	private String cor;
	
	
	public String getOlhos() {
		return olhos;
	}


	public void setOlhos(String olhos) {
		this.olhos = olhos;
	}


	public String getPatas() {
		return patas;
	}


	public void setPatas(String patas) {
		this.patas = patas;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public abstract String fazerBarulho();
	
	
}
