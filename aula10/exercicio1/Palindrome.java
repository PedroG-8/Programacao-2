package aula10.exercicio1;

import java.util.Scanner;
import p2utils.*;

public class Palindrome 
{
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print(": ");
		String phrase = kb.nextLine();
		if(isPalindrome(phrase))
			System.out.println("A frase é um palíndromo!");
		else
			System.out.println("A frase não é um palíndromo!");
	}
	
	public static boolean isPalindrome(String phrase)
	{
		Stack<Character> stack = new Stack<Character>();
		Queue<Character> queue = new Queue<Character>();
		boolean isPalindrome = true;
		
		for(int i = 0; i < phrase.length(); i++)
		{
			if(!Character.isWhitespace(phrase.charAt(i)))
			{
				stack.push(phrase.charAt(i));
				queue.in(phrase.charAt(i));
			}	
		}
		for(int j = 0; j < stack.size(); j++)
		{
			if(!stack.top().equals(queue.peek()))
			{
				isPalindrome = false;
				break;
			}
			stack.pop();
			queue.out();
		}
		return isPalindrome;
	}
}
