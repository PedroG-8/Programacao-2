package aula03;

public class Tarefa
{
	Data inicio;
	Data fim;
	String texto;
	
	public Tarefa(Data ini, Data fim, String texto)
	{
		inicio = ini;
		this.fim = fim;
		this.texto = texto;
	}
	
	public Data fim()
	{
		return fim;
	}
	
	public String texto()
	{
		return texto;
	}
	
	public Data inicio()
	{
		return inicio;
	}
	
	@Override
	public String toString()
	{
		return inicio + " --- " + fim + " " + texto;
	}
}