package display;

public class Display {

	private String valor;
	
	public Display(String valor) {
		this.valor = valor;
	}
	

	public String imprime() {		
		String display = "";
		if("0".equals(this.valor)) {
			String linha1 = " _ \n";
			String linha2 = "| |\n";
			String linha3 = "|_|\n";
			display = linha1 + linha2 + linha3;
		}
		else {
			String linha1 = " \n";
			String linha2 = "|\n";
			String linha3 = "|\n";
			display =  linha1 + linha2 + linha3;
		}
		System.out.println(display);
		return display;
	}

}
