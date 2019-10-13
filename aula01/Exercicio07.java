package aula01;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercicio07 
{
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Ficheiro que pretende copiar: ");
		String file1 = kb.nextLine();
		File f1 = inputFile(file1);
		System.out.print("Ficheiro de destino: ");
		String file2 = kb.nextLine();
		File f2 = outputFile(file2);
		copyFiles(f1, f2);	
	}
	
	public static File inputFile(String name)
	{
		File f = new File(name);
		if(!f.exists())
		{
			System.err.println("Ficheiro não existe");
		}
		else if(f.isDirectory())
		{
			System.out.println("Ficheiro é um diretório");
		}
		return f;
	}
	
	public static File outputFile(String name)
	{
		File f = new File(name);
		if(f.exists())
		{
			System.err.println("Ficheiro já existente");
		}
		else if(f.isDirectory())
		{
			System.out.println("Ficheiro é um diretório");
		}
		return f;
	}
	
	public static boolean copyFiles(File f1, File f2)
	{
		System.out.println("Tem a certeza que quer copiar? s/n");
		String ans = kb.nextLine();
		if(!ans.equals("s"))
		{
			System.out.println("Ficheiro não copiado!");
			return false;	
		}
		Scanner read;
		PrintWriter write;
		try 
		{
			write = new PrintWriter(f2);
			read = new Scanner(f1);
			while(read.hasNextLine())
			{
				write.println(read.nextLine());
			}
			write.close();
			read.close();
			System.out.println("Ficheiro copiado com sucesso");
		} catch (Exception e) 
		{
			System.out.println("Ficheiro não encontrado");
		}
		return true;
	}
}
