package aula08.exercicio1;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args)
	{
		readFile("src/aula08/File1");
		readFile("src/aula08/File2");
		sort(list);
	}

	public static void readFile(String fileName)
	{
		try
		{
			File f = new File(fileName);
			Scanner read = new Scanner(f);
			while(read.hasNextLine())
			{
				String s = read.nextLine();
				int num;
				try
				{
					num = Integer.parseInt(s);
					list.add(num);
				}
				catch(Exception e)
				{
				}
			}
			read.close();
		}
		catch(Exception e)
		{
			System.out.println("Some error...");
		}
	}
	
	public static void sort(ArrayList<Integer> l)
	{
		int[] ordered = new int[list.size()];
		int index = 0;
		for(Integer li : list)
		{
			ordered[index] = li;
			index++;
		}
		
		for(int i = 0; i < ordered.length; i++)
		{
			for(int j = i; j < ordered.length; j++)
			{
				if(ordered[j] < ordered[i])
				{
					int prov = ordered[i];
					ordered[i] = ordered[j];
					ordered[j] = prov;
				}
			}
		}
		
		for(int o : ordered)
		{
			System.out.println(o);
		}
	}
}
