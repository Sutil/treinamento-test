package display;

public class Display {

	private String valor;
	
	public Display(String valor) {
		this.valor = valor;
	}
	

	public String imprime() {
		if(!isValorValido()){
			throw new RuntimeException("Valor inválido");
		}
		
		String[] split = this.valor.split("");
		
		StringBuilder builder = new StringBuilder();
		
		for(int linha = 0 ; linha < 3; linha++){
			for(String numero : split){
				String parteDigito = Digito.fromValue(numero).getImpressor().getLinha(linha);
				builder.append(parteDigito);
			}
			builder.append(System.lineSeparator());
		}
		
		System.out.println(builder.toString());
		
		return builder.toString();
	}


	private boolean isValorValido() {
		return valor != null &&
				valor.matches("[0-9]+");
	}
	
	

}
