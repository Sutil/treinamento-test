package display;

public class Impressor1 extends Impressor {

	private static final String linha1 = " ";
	private static final String linha2 = "|";
	private static final String linha3 = "|";
	private static final String[] linhas = {linha1,linha2,linha3};
	
	public String imprimir(){
		String linha1 = " ";
		String linha2 = "|";
		String linha3 = "|";
		
		return linha1+linha2+linha3;
	}

	@Override
	String getLinha(int linha) {
		return linhas[linha];
	}
}
