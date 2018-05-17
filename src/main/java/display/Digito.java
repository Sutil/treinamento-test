package display;

import java.util.HashMap;
import java.util.Map;

public enum Digito {
	
	ZERO("0", new Impressor0()),
	UM("1", new Impressor1());
	
	private String valor;
	private Impressor impressor;

	private Digito(String valor, Impressor impressor){
		this.valor = valor;
		this.impressor = impressor;
	}
	
	public String getValor() {
		return valor;
	}
	
	static Map<String, Digito> valores = new HashMap<>();
	
	static {
		for(Digito d : values()){
			valores.put(d.valor, d);
		}
	}

	public static Digito fromValue(String valor) {
		return valores.get(valor);
	}

	public Impressor getImpressor() {
		return impressor;
	}

}
