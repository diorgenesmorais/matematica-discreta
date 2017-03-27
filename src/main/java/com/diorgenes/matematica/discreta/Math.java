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
		return (n == 1) ? n : n * nFatorial(n - 1);
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
	 * Potenciação. (só para estudo - já existe um método na classe
	 * java.lang.Math.pow(a,b))
	 * 
	 * <pre>
	 * Caso de uso:
	 * Arranjo com repetição.
	 * </pre>
	 * 
	 * @param b
	 *            base.
	 * @param n
	 *            expoente.
	 * @return a potência de {@code n}<sup>{@code r}</sup>
	 */
	public static long potenciacao(final int b, int n) {
		long resultado = 1L;
		while (n-- > 0) {
			resultado *= b;
		}
		return resultado;
	}

	/**
	 * É número primo.
	 * 
	 * @param n
	 *            número.
	 * @return {@code true} se for primo.
	 */
	public static boolean isPrimo(final int n) {
		int x = n, i = 0;
		while(x > 0){
			if(!(n % x > 0)){
				i++;
			}
			x--;
		}
		return (i == 2);
	}

}
