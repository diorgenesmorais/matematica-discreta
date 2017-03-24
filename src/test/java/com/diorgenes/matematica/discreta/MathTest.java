package com.diorgenes.matematica.discreta;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathTest {

	@Test
	public void deveFatoriarUmNumero() throws Exception {
		long expected = 120L;
		/*
		 * O fatorial do número 5
		 */
		assertEquals(expected, Math.nFatorial(5));
	}

	@Test
	public void deveCalcularArranjoSimples() throws Exception {
		long expected = 60L;
		/*
		 * Com os algarismos 1,2,3,4,5. Quantos números de 3 algarismos
		 * distintos podem ser formados?
		 */
		assertEquals(expected, Math.arranjoSimples(5, 3));
	}

	@Test
	public void deveCalcularCombinacaoSimples() throws Exception {
		long expected = 10L;
		/*
		 * Com as pessoas A,B,C,D,E. Quantas comissões de 3 membros podem ser
		 * formados?
		 */
		assertEquals(expected, Math.combinacaoSimples(5, 3));
	}

	@Test
	public void deveCalcularArranjoComRepeticao() throws Exception {
		long expected = 125L;
		/*
		 * Considerando um conjunto das vogais, quantas senhas com 3 letras,
		 * podemos repetir?
		 */
		assertEquals(expected, Math.potenciacao(5, 3));
	}

	@Test
	public void deveCalcularPermutacaoComElementosRepetidos() throws Exception {
		long expected = 5040L;
		/*
		 * Anagrama da palavra: INTERNET (como existe repetição das letras N, T,
		 * E)
		 */
		assertEquals(expected, Math.permutacaoRepetidos(8, 2, 2, 2));
	}
}
