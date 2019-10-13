package aula11.exercicio1;
import java.util.Scanner;
import java.io.*;
public class CheckPasswd 
{
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) 
	{
		KeyValueList<String> loginInfo = new KeyValueList<String>();
		
		System.out.print("Nome do ficheiro: ");
		String fileName = kb.nextLine();
		File f = new File(fileName + ".txt");
		try 
		{
			Scanner read = new Scanner(f);
			while(read.hasNextLine())
			{
				loginInfo.set(read.next(), read.next());
				read.nextLine();
			}
			read.close();
		} catch (FileNotFoundException e) 
		{
			System.out.println("Could not find the file!");
			System.exit(0);
		}
		
		while(true)
		{
			System.out.print("Username: ");
			String usr = kb.nextLine().trim();
			System.out.print("Password: ");
			String psw = kb.nextLine().trim();
			if(!loginInfo.contains(usr))
			{
				System.out.println("Oops, wrong username!");
			}
			else if(!loginInfo.get(usr).equals(psw))
			{
				System.out.println("The password is incorrect!");
			}
			else
			{
				System.out.println("Authentication successful");
			}
			
		}
		
	}
}
