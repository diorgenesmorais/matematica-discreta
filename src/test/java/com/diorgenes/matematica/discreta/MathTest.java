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
		assertEquals(expected, (long) Math.potenciacao(5, 3));
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

	@Test
	public void confirmarSeEhConjuntoDeNumerosPrimos() throws Exception {
		boolean expected = true;
		int x[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		for (int i : x) {
			assertEquals(expected, Math.isPrimo(i));
		}
	}

	@Test
	public void deveCalcularValorUsandoNotacaoCientifica() throws Exception {
		double expected = 0.00016;
		/*
		 * Calcular o valor da notação científica de 1.6E-4 (1.6*10^-4)
		 */
		assertEquals(expected, (1.6 * Math.potenciacao(10, -4)), 0.0001);
	}

	private long fibonacci(int n) {
		return (n < 2) ? n : fibonacci(n - 2) + fibonacci(n - 1);
	}

	@Test
	public void deveGerarUmaSequenciaFibonacci() throws Exception {
		int[] expected = { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 };
		for (int i = 1; i < 13; i++) {
			assertEquals(expected[i - 1], fibonacci(i));
		}
	}

	@Test
	public void deveCalcularPotenciaComExpoenteZero() throws Exception {
		double expected = 1; // potencia de 2^0
		assertEquals(expected, Math.potenciacao(2, 0), 0.00001);
	}

}
