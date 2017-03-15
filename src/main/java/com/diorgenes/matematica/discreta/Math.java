package com.diorgenes.matematica.discreta;

/**
 * The class {@code Math} contains methods for performing basic numeric
 * operations
 * 
 * @author Diorgenes Morais
 * @version 1.0.0
 */
public class Math {

	/**
	 * N! - fatorial de n.
	 * 
	 * @param n
	 *            um número do conjunto natural
	 * @return o fatorial de n (N!).
	 */
	public static long nFatorial(int n) {
		if (n == 1) {
			return n;
		} else {
			return n * nFatorial(n - 1);
		}
	}

	/**
	 * Arranjo Simples
	 * 
	 * @param n
	 *            quantos números no arranjo.
	 * @param p
	 *            permuta (distinção).
	 * @return o produto de n! / (n - p)!
	 */
	public static long arranjoSimples(int n, int p) {
		return nFatorial(n) / nFatorial(n - p);
	}

	/**
	 * Combinação Simples
	 * 
	 * @param n
	 *            quantos números na combinação.
	 * @param p
	 *            permutas na combinação.
	 * @return o produto de n! / p!(n - p)!
	 */
	public static long combinacaoSimples(int n, int p) {
		return nFatorial(n) / (nFatorial(p) * nFatorial(n - p));
	}

	/**
	 * Permutação com elemento repetidos
	 * 
	 * @param n
	 *            permuta
	 * @param k
	 *            valores repetidos
	 * @return o produto de Pn
	 */
	public static long permutacaoRepetidos(int n, int... k) {
		long denominador = 1L;
		for (int i : k) {
			denominador *= nFatorial(i);
		}
		return nFatorial(n) / denominador;
	}

	/**
	 * Arranjo com repetição.
	 * 
	 * @param n
	 *            conjunto.
	 * @param r
	 *            repetição.
	 * @return o produto de n^r
	 */
	public static long arranjoComRepeticao(final int n, int r) {
		long resultado = 1L;
		while (r-- > 0) {
			resultado *= n;
		}
		return resultado;
	}
}
