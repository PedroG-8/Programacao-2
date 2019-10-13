package aula07.exercicio1;

import static java.lang.System.*;
import java.io.*;
import java.util.Scanner;
// import java.util.*;   // => "error: reference to LinkedList is ambiguous"
// java.util.LinkedList colide com p2utils.LinkedList!

public class FilterLines2
{
	public static void main(String[] args) throws IOException
	{
	    File fil = new File("Aveiro.txt");
	
	    LinkedList<String> curtas = new LinkedList<String>();
	    LinkedList<String> medias = new LinkedList<String>();
	    LinkedList<String> longas = new LinkedList<String>();
	
	    Scanner sf = new Scanner(fil);
	    while (sf.hasNextLine())
	    {
	    	String line = sf.nextLine().trim();
	    	if(line.length() < 20)
	    	{
	    			curtas.addLast(line);
	    	}
			else if(line.length() < 40)
			{
					medias.addLast(line);
			}
			else
			{
					longas.addLast(line);
			}
	    }
	    sf.close();
	
	    // Escrever conteúdo das listas...
	    out.println("Curtas---|---------|---------|---------|---------\n");
	    curtas.print();
	
	    out.println("\nMédias---|---------|---------|---------|---------\n");
	    medias.print();
	
	    out.println("\nLongas---|---------|---------|---------|---------");
	    longas.print();
	  }
}
