package aula01;
import java.util.Scanner;

public class Exercicio01 
{
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Operaçao: ");
		String num = kb.nextLine();
		try
		{
			String[] num2 = num.split(" ");
			Double op1 = Double.parseDouble(num2[0]);
			Double op2 = Double.parseDouble(num2[2]);
			
			if(num2[1].equals("+"))
			{
				System.out.println("Resultado: " + (op1 + op2));
			}
			else if(num2[1].equals("-"))
			{
				System.out.println("Resultado: " + (op1 - op2));
			}
			else if(num2[1].equals("*"))
			{
				System.out.println("Resultado: " + (op1 * op2));
			}
			else if(num2[1].equals("/"))
			{
				System.out.println("Resultado: " + (op1 / op2));
			}
			else
			{
				System.err.println("Operação inválida");
			}
		} catch(Exception e)
		{
			System.err.println("Operação inválida");
		}
		
	}

}
