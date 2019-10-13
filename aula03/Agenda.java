package aula03;

public class Agenda 
{
	Tarefa[] tarefas = new Tarefa[1000];
	int num = 0;
	
	public void novaTarefa(Tarefa t)
	{
		tarefas[num] = t;
		num++;
	}
	
	public void escreve()
	{
		for(int i = 0; i < num; i++)
		{
			for(int j = 0; j < num; j++)
			{
				if(tarefas[i].fim.compareTo(tarefas[j].fim) == -1)
				{
					Tarefa tmp = tarefas[i];
					tarefas[i] = tarefas[j];
					tarefas[j] = tmp;
				}
			}
			
		}
		System.out.println("Agenda:");
		for(int i = 0; i < num; i++)
		{
			System.out.println(tarefas[i]);
		}
	}

	public Agenda filtra(Data d1, Data d2) 
	{
		Agenda todo = new Agenda();
		for(int i = 0; i < num; i++)
		{
			if((tarefas[i].inicio.compare(d1) >= 0 && tarefas[i].inicio.compare(d2) <= 0)
					|| (tarefas[i].fim.compare(d1) >= 0 && tarefas[i].fim.compare(d2) <= 0))
			{
				todo.novaTarefa(tarefas[i]);
			}
		}
		return todo;
	}
	
}
