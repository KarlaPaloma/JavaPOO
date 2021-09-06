package ClasseMamiferos;
public class Gato extends Mamifero {
	
	private String calda;
	private String focinho;
	
	@Override
	public String fazerBarulho() {
		
		return "miau";
	}

	public String getCalda() {
		return calda;
	}

	public void setCalda(String calda) {
		this.calda = calda;
	}

	public String getFocinho() {
		return focinho;
	}

	public void setFocinho(String focinho) {
		this.focinho = focinho;
	}

	public Gato(String calda, String focinho) {
		super();
		this.calda = calda;
		this.focinho = focinho;
	}
	
	public Gato() {
		
	}
	
	

}
