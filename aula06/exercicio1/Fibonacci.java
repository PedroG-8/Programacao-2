package aula06.exercicio1;

import java.util.Scanner;
import static java.lang.System.*;

public class Fibonacci 
{
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) 
	{

	    // Alguns testes:
	    assert fibonacci(0) == 0;
	    assert fibonacci(1) == 1;
	    assert fibonacci(2) == 1;
	    assert fibonacci(5) == 5;

	    System.out.print("n: ");
	    int n = Integer.parseInt(kb.nextLine());
	    long time = nanoTime();  // System.nanoTime() gives the time in ns.
	    int f = f(n);
	    time = nanoTime() - time;
	    out.printf("fibonacci(%d) = %d (%d ns)\n", n, f, time);
	}

	// n = 40: 102334155
	// fibonacci(40) -> 512489095 ns
	// f(40)         -> 9778 ns
	public static int fibonacci(int n) 
	{
	    assert n >= 0 : "n must be >= 0";
	    if(n <= 1)
	    	return n;
	    else
	    	n = fibonacci(n - 2) + fibonacci(n - 1);
	    return n;
	}
	
	static int array[] = new int[50];
	
	public static int f(int n)
	{
		assert n >= 0 : "n must be >= 0";
		assert n < array.length : "n must be < 50";
		
		if(n <= 1)
			array[n] = n;
		
		else if(array[n] == 0)
		{
			array[n] = f(n - 2) + f(n - 1);
		}
		return array[n];		
	}
}
