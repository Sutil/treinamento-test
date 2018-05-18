package display;


import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DisplayTest {
	
	@Rule
	public ExpectedException expectedException = ExpectedException.none();

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
	
	@Test
	public void Imprime13() {
		String saida = new Display("13").imprime();

		String linha1 = "  _ \n";
		String linha2 = "| _|\n";
		String linha3 = "| _|\n";
		String saidaEsperada = linha1 + linha2 + linha3;

		assertEquals(saidaEsperada, saida);
	}
	
	@Test
	public void NaoImprimeNulo() {
		expectedException.expect(RuntimeException.class);
		expectedException.expectMessage("Valor inválido");
		
		new Display(null).imprime();
	}
	
	@Test
	public void ErroAoImprimirVazio() {
		expectedException.expect(RuntimeException.class);
		expectedException.expectMessage("Valor inválido");
		
		new Display("").imprime();
	}

	@Test
	public void ErroAoImprimirLetraComNumero() {
		expectedException.expect(RuntimeException.class);
		expectedException.expectMessage("Valor inválido");
		
		new Display("a4").imprime();
	}
	
	@Test
	public void ErroAoImprimirNumeroLetra() {
		expectedException.expect(RuntimeException.class);
		expectedException.expectMessage("Valor inválido");
		
		new Display("4a").imprime();
	}
	
	
	@Test
	public void ErroAoImprimirCaracterEspecial() {
		expectedException.expect(RuntimeException.class);
		expectedException.expectMessage("Valor inválido");
		
		new Display("*").imprime();
	}
	
	@Test
	public void ErroAoImprimirNumerosSeguidosDeLetra() {
		expectedException.expect(RuntimeException.class);
		expectedException.expectMessage("Valor inválido");
		
		new Display("22222a").imprime();
	}
	
	@Test
	public void ErroAoImprimirNumeroDecimal() {
		expectedException.expect(RuntimeException.class);
		expectedException.expectMessage("Valor inválido");
		
		new Display("0.1").imprime();
	}
	

}
