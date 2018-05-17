package display;

public class Impressor0 extends Impressor {
	
	private static final String linha1 = " _ ";
	private static final String linha2 = "| |";
	private static final String linha3 = "|_|";
	
	private static final String[] linhas = {linha1, linha2, linha3};
	
	public String imprimir(){
		String linha1 = " _ \n";
		String linha2 = "| |\n";
		String linha3 = "|_|\n";
		
		return linha1+linha2+linha3;
	}
	
	String getLinha(int linha){
		return linhas[linha];
	}

}
