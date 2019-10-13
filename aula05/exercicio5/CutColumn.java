package aula05.exercicio5;

import java.io.File;
import java.util.Scanner;

public class CutColumn 
{
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int column = isNumber("Coluna: ");
		readFile("texto.txt", column);

	}
	
	public static void readFile(String s, int column)
	{
		File f = new File(s);
		int space = 1;
		try
		{
			Scanner read = new Scanner(f);
			while(read.hasNextLine())
			{
				String linha = read.nextLine().trim();
				String result = "";
				for(int i = 0; i < linha.length() - 1; i++)
				{
					if(Character.isWhitespace(linha.charAt(i)) && !Character.isWhitespace(linha.charAt(i + 1)))
					{
						space++;
						if(space == column)
						{
							if(Character.isWhitespace(linha.charAt(i + 1)))
							{
								break;
							}
							result = result + linha.charAt(i);
						}
					}
				}
			}
			read.close();
		}
		catch(Exception e)
		{
			System.out.println("Ficheiro inválido");
		}
	}
	
	public static int isNumber(String prompt)
	{
		int num;
		while(true)
		{
			try
			{
				System.out.print(prompt);
				num = Integer.parseInt(kb.nextLine());
				break;
			}
			catch(Exception e)
			{
				System.out.println("Número inválido!");
			}
		}
		return num;
	}
}
