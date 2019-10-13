package aula04.exercicio02;

public class Tarefa
{
	Data inicio;
	Data fim;
	String texto;
	
	public Tarefa(Data ini, Data fim, String texto)
	{
		assert(iniFim(ini, fim)): "Data invalida";
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
	
	public boolean iniFim(Data i, Data f)
	{
		if(i.compareTo(f) <= 0)
		{
			return false;
		}
		return true;
	}
	
	@Override
	public String toString()
	{
		return inicio + " --- " + fim + " " + texto;
	}
}