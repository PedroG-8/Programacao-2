package aula05.exercicio2;

import java.util.Scanner;

public class PlayGuessGame 
{
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) 
	{
		Intervalo i = new Intervalo();
		System.out.println("---> Guess Game <---\n");
		validMinMax(i);
		int randValue = (int)(Math.random() * (i.max + 1 - i.min)) + i.min;
		isRight(i, randValue);
	}
	
	public static void validMinMax(Intervalo i)
	{
		while(true)
		{
			System.out.print("Introduzir minimo: ");
			try
			{
				i.min = Integer.parseInt(kb.nextLine());
				break;
			}
			catch(Exception e)
			{
				System.out.println("Numero invalido!");
			}
		}
		
		while(true)
		{
			System.out.print("Introduzir maximo: ");
			try
			{
				i.max = Integer.parseInt(kb.nextLine());
				if(i.max > i.min)
				{
					break;
				}
				System.out.println("Maximo tem de ser maior que o minimo!");
			}
			catch(Exception e)
			{
				System.out.println("Numero invalido!");
			}
		}
	}
	
	public static void isRight(Intervalo i, int number)
	{
		int guess, count = 0;
		while(true)
		{
			System.out.print("Guess: ");
			try
			{
				guess = Integer.parseInt(kb.nextLine());
				count++;
				if(guess < i.min || guess > i.max)
				{
					System.out.println("Número fora do intervalo!");
					count--;
				}
				else if(guess < number)
				{
					System.out.println("Mais alto!");
				}
				else if(guess > number)
				{
					System.out.println("Mais baixo!");
				}
				else
				{
					System.out.println("Ganhaste em " + count + " tentativas!");
					break;
				}
			}
			catch(Exception e)
			{
				System.out.println("Número inválido!");
			}
		}
	}
}

class Intervalo
{
	int min;
	int max;
}
