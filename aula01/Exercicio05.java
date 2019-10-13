package aula01;
import java.util.Scanner;

public class Exercicio05 
{
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("---> Lista de números <---");
		introduzirNumeros();
	}
	public static void introduzirNumeros()
	{
		int count = 0;
		double soma = 0, media = 0;
		while(true)
		{
			System.out.print("N: ");	
			double num = Double.parseDouble(kb.nextLine());
			soma = soma + num;
			if(num == 0)
			{
				break;
			}
			count++;
		}
		if(count == 0)
		{
			System.out.println("Lista vazia!");
			System.exit(0);
		}
		else
		{
			media = soma / count;
		}
		System.out.println("Soma: " + soma);
		System.out.println("Média " + media);
	}
}
