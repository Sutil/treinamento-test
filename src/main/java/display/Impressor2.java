package display;

public class Impressor2 extends Impressor {
	
	private static final String linha1 = " _ ";
	private static final String linha2 = " _|";
	private static final String linha3 = "|_ ";
	private static final String[] linhas = {linha1,linha2,linha3};

	@Override
	String getLinha(int linha) {
		return linhas[linha];
	}

}
