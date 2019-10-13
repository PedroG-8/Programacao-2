package aula10.exercicio1;

import p2utils.Stack;

public class HanoiTowers
{
	private int numMoves = 0;
	private Stack<Integer> pile1 = new Stack<Integer>();
	private Stack<Integer> pile2 = new Stack<Integer>();
	private Stack<Integer> pile3 = new Stack<Integer>();
	
	public HanoiTowers(int num)
	{
		assert num > 0;
		for(int i = num; i >0 ; i--)
		{
			pile1.push(i);
		}
		pile1.name = "Tower 1";
		pile2.name = "Tower 2";
		pile3.name = "Tower 3";
	}
	
	// 5  
	// 4
	// 3 2 1
	
	public void solve()
	{
		assert !pile1.isEmpty();
		while(!pile1.isEmpty())
		{
			if(pile3.isEmpty() && !pile1.isEmpty())
				moveDisk(pile1, pile3);
			else if(pile2.isEmpty() && !pile1.isEmpty())
				moveDisk(pile1, pile2);
			else
				if(numMoves > 30) break;
				else if(pile3.top() < pile2.top() && pile3.size() == 1)
					moveDisk(pile3, pile2);
				else if(pile2.top() + 1 == pile3.top())
					moveDisk(pile2, pile3);
				else if(pile2.size() == 1)
					moveDisk(pile3, pile1);
				else if(pile2.top() < pile1.top())
					moveDisk(pile2, pile1);
				else break;
			solve();
		}
	}
	
	public void moveDisk(Stack<Integer> origem, Stack<Integer> destino)
	{
		System.out.println(origem.name + " (" + origem.top() + ") -> " + destino.name);
		numMoves++;
		destino.push(origem.top());
		origem.pop();
	}
	
	public int numberOfMoves()
	{
		return numMoves;
	}
}
