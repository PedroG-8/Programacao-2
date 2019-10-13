package aula02;

import java.util.Scanner;

public class TestData 
{
	
	static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) 
	{	    
	    System.out.printf("Data.bissexto(2018) = %b\n", Data.bissexto(2018));
	
	    Data d1 = new Data();
	    System.out.printf("d1.toString() = %s\n", d1.toString());
	    System.out.printf("d1 = %s\n", d1); 
	
	    
	    System.out.printf("d1.ano() = %d\n", d1.ano());
	    System.out.printf("d1.mes() = %d\n", d1.mes());
	    System.out.printf("d1.dia() = %d\n", d1.dia());
	
	    for (int ano = 2015; ano < 2020; ano++)
	    {
	    	System.out.printf("Data.diasDoMes(2, %d) = %d\n", ano, Data.diasDoMes(2, ano));
	    }
	
	    System.out.printf("d1.mesExtenso() = %s\n", d1.mesExtenso());
	
	    System.out.printf("d1.extenso() = %s\n", d1.extenso());
	
	    System.out.printf("Data.dataValida(29, 2, 2016) = %b\n",
	                Data.dataValida(29, 2, 2016)); // true
	    System.out.printf("Data.dataValida(31, 4, 2018) = %b\n",
	                Data.dataValida(31, 4, 2018)); // false
	    System.out.printf("Data.dataValida(0, 4, 2018) = %b\n",
	                Data.dataValida(0, 4, 2018)); // false
	
	    Data d2 = new Data(29, 2, 2017);
	    
	    System.out.printf("d2 = %s = %s\n", d2, d2.extenso());
	    d2.seguinte();
	    System.out.printf("d2 = %s = %s\n", d2, d2.extenso());
	    d2.seguinte();
	    System.out.printf("d2 = %s = %s\n", d2, d2.extenso());
	}
}

