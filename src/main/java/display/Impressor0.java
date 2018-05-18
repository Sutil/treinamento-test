package display;

public class Impressor0 extends Impressor {
	
	private static final String linha1 = " _ ";
	private static final String linha2 = "| |";
	private static final String linha3 = "|_|";
	
	private static final String[] linhas = {linha1, linha2, linha3};
	
	String getLinha(int linha){
		return linhas[linha];
	}

}
