package aula01;
import java.util.Scanner;

public class Exercicio04 
{
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Frase: ");
		String frase = kb.nextLine();
		System.out.println("Tradução: " + traducao(frase));
	}
	public static String traducao(String frase)
	{
		String novaFrase = "";
		for(int i = 0; i < frase.length(); i++)
		{
			char letra = frase.charAt(i);
			if(frase.charAt(i) == 'l')
			{
				letra = 'u';
			}
			else if(frase.charAt(i) == 'L')
			{
				letra = 'U';
			}
			if(frase.charAt(i) != 'r' && frase.charAt(i) != 'R')
			{
				novaFrase = novaFrase + letra;
			}
		}
		return novaFrase;
	}
}
