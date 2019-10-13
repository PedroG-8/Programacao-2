package aula06.exercicio6;

import static java.lang.System.*;
import java.util.Arrays;
import java.util.Scanner;

public class Ngrams 
{
	private static char[] p;   
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String[] s;
		System.out.print("Carateres para usar: ");
		String alpha = kb.nextLine();
		s = allNgrams(alpha, alpha.length());
		out.println(Arrays.toString(s));
	}

  // Gera todos os arranjos de 3 símbolos escolhidos do alfabeto alpha.
  public static String[] all3grams(String alpha) {
    int l = alpha.length();
    String[] arr = new String[l*l*l];
    int n = 0;
    for (int i = 0; i < l; i++) {
      for (int j = 0; j < l; j++) {
        for (int k = 0; k < l; k++) {
          arr[n] = "" +  alpha.charAt(i) + alpha.charAt(j) + alpha.charAt(k);
          n++;
        }
      }
    }
    assert n == arr.length;
    return arr;
  }

  
  	static int count = 0;
  	public static String[] allNgrams(String alpha, int n) 
  	{
  		String[] arr = new String[(int) Math.pow(n, n)];
  	// StringBuilder wordRep = new StringBuilder(alpha);
  		return arr;
  	}
}

