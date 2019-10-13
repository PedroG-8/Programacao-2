package aula01;
import java.util.Scanner;

public class Exercicio06 
{
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args)
	{
		int tentativas = 0;
		int random = (int)(Math.random() * 100) + 1;
		System.out.println("---> Adivinha o número <---");
		while(true)
		{
			System.out.print("Numero: ");
			int num = Integer.parseInt(kb.nextLine());
			tentativas++;
			if(num == random)
			{
				break;
			}
			if(num < random)
			{
				System.out.println("Mais alto");
			}
			else if(num > random)
			{
				System.out.println("Mais baixo");
			}
		}
		if(tentativas == 1)
		{
			System.out.println("Acertaste à primeira tentativa!!");
		}
		else
		{
			System.out.println("Acertaste em " + tentativas + " tentativas!");
		}
	}
}
