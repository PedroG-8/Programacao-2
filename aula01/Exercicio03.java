package aula01;
import java.util.Scanner;

public class Exercicio03 
{
    static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) 
	{
	    int n;
		while (true) 
		{
	        System.out.print("Numero: ");
	    	n = kb.nextInt();
		    if (n > 0) break;
		    System.err.println("ERROR: invalid number!");
	    }

		String verb = isPrime(n)? "is" : "is not";
		System.out.printf("Number %d %s prime\n", n, verb);
	}

	public static boolean isPrime(int n) 
	{
		if((n % 2) == 0)
		{
			return false;
		}
		
		for(int i = 3; i < (n / 2); i = i + 2)
		{
			if((n % i) == 0)
			{
				return false;
			}
		}
		return true;
	}
}
