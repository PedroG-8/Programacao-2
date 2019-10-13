package aula07.exercicio1;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FilterLines 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("Aveiro.txt");
		Scanner read = new Scanner(f);
		LinkedList<String> menosDe20 = new LinkedList<String>();
		LinkedList<String> menosDe40 = new LinkedList<String>();
		LinkedList<String> maisDe40 = new LinkedList<String>();
		while(read.hasNextLine())
		{
			String s = read.nextLine().trim();
			int num = getNumWords(s);
			if(num < 20)
				menosDe20.addFirst(s);
			else if(num < 40)
				menosDe40.addFirst(s);
			else
				maisDe40.addFirst(s);
			System.out.println(num);
		}
		read.close();
		System.out.println(menosDe20.toString());
		System.out.println(menosDe40.size());
		System.out.println(maisDe40.size());
		
			
		
		
		
	}
	
	public static int getNumWords(String s)
	{
		int num = 0;
		for(int i = 0; i < s.length(); i++)
		{
			if(Character.isWhitespace(s.charAt(i)))
			{
				num++;
			}
		}
		return num;
	}

}
