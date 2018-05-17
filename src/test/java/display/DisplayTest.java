package display;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DisplayTest {

	@Test
	public void ImprimeZero() {
		String saida = new Display("0").imprime();

		String linha1 = " _ \n";
		String linha2 = "| |\n";
		String linha3 = "|_|\n";
		String saidaEsperada = linha1 + linha2 + linha3;

		assertEquals(saidaEsperada, saida);
	}

	@Test
	public void ImprimeUm() {
		String saida = new Display("1").imprime();

		String linha1 = " \n";
		String linha2 = "|\n";
		String linha3 = "|\n";
		String saidaEsperada = linha1 + linha2 + linha3;

		assertEquals(saidaEsperada, saida);
	}
	
	@Test
	public void ImprimeDois() {
		String saida = new Display("2").imprime();

		String linha1 = " _ \n";
		String linha2 = " _|\n";
		String linha3 = "|_ \n";
		String saidaEsperada = linha1 + linha2 + linha3;

		assertEquals(saidaEsperada, saida);
	}
	
	@Test
	public void Imprime10() {
		String saida = new Display("10").imprime();

		String linha1 = "  _ \n";
		String linha2 = "|| |\n";
		String linha3 = "||_|\n";
		String saidaEsperada = linha1 + linha2 + linha3;

		assertEquals(saidaEsperada, saida);
	}

}
