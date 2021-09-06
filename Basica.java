package ClasseMamiferos;
public class Basica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gato gato1 = new Gato();
	
		gato1.setCor("preto");
		gato1.setPatas("4"); 
		gato1.setOlhos("2");
		
		System.out.println("O gato tem calda " + gato1.getCalda());
		System.out.println("O gato tem a cor " + gato1.getCor());
		System.out.println("O gato tem focinho " + gato1.getFocinho());
		System.out.println("O gato tem patas " + gato1.getPatas());
		System.out.println("O gato tem olhos " + gato1.getOlhos());
		System.out.println("o gato faz o barulho " + gato1.fazerBarulho());
		

	}

}
