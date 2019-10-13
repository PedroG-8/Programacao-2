package aula03;
import java.util.Scanner;
import java.io.*;

public class TestTarefa1 
{
	public static void main(String[] args) throws IOException 
	{
		Tarefa[] tarefas = new Tarefa[1000];
		File f = new File("tasks.txt");
		int n = loadFile(f, tarefas);
		for(int i = 0; i < n; i++) 
		{
			System.out.println(tarefas[i].toString());
		}
		System.out.println(tarefas[0].fim());
		System.out.println(tarefas[0].texto());
		System.out.println(tarefas[n-1].inicio());
	}
	/** Load tasks from a text file.
	* @param f  the name of the file
	* @param tasks an array where tasks are stored
	* @return the number of tasks actually read
	*/
	
	public static int loadFile(File f, Tarefa[] tasks) throws IOException 
	{
		Scanner scf = new Scanner(f);
		int n = 0;  // number of lines read
		while (n < tasks.length && scf.hasNextLine()) 
		{
			 String line = scf.nextLine();
			 String[] p = line.split("\t");
			 Data ini = new Data(p[0].trim());
			 Data fim = new Data(p[1].trim());
			 tasks[n] = new Tarefa(ini, fim, p[2].trim());
			 n++;
		}
		scf.close();
		return n;
	}
}
