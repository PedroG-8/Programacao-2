package aula01;
import java.util.Scanner;

public class Exercicio02 
{
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("---> Calcular nota final do aluno <---");
		System.out.println("Avaliaçao teórica");
		System.out.print("ATP 1: ");
		double atp1 = introduzirNota(kb.nextLine());
		System.out.print("ATP 2: ");
		double atp2 = introduzirNota(kb.nextLine());
		System.out.print("ATP 3: ");
		double atp3 = introduzirNota(kb.nextLine());
		System.out.println("Avaliaçao prática");
		System.out.print("AP 1: ");
		double ap1 = introduzirNota(kb.nextLine());
		System.out.print("AP 2: ");
		double ap2 = introduzirNota(kb.nextLine());
		System.out.println("Nota final: " + media(atp1, atp2, atp3, ap1, ap2));
	}

	public static double introduzirNota(String notaString)
	{
		double nota = Double.parseDouble(notaString);
		if(!notaValida(nota)) 
		{
			System.out.println("Nota invalida (considerada 0)");
			return 0;
		}
		return nota;
	}
	
	public static boolean notaValida(double nota)
	{
		if(nota < 0 || nota > 20)
		{
			return false;
		}
		return true;
	}
	
	public static double media(double atp1, double atp2, double atp3, double ap1, double ap2)
	{
		double notaPratica = (ap1 + ap2) / 2;
		if(notaPratica < 6.5)
		{
			System.out.println("Aluno reprovado na prática");
		}
		double notaTeorica = (atp1 + atp2 + atp3) / 3;
		if(notaTeorica < 6.5)
		{
			System.out.println("Aluno reprovado na teórica");
		}
		double notaFinal = (notaPratica * 0.7) + (notaTeorica * 0.3);
		if(notaFinal < 9.5)
		{
			System.out.println("Aluno reprovado em época normal");
		}
		return notaFinal;
	}
}
