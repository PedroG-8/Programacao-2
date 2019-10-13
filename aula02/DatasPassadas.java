package aula02;

public class DatasPassadas
{
	public static void main(String[] args) 
	{
		Data hoje = new Data();
		Data natal = ultimoNatal();
		System.out.println("Todas as datas desde " + natal);
		while(true)
		{
			natal.seguinte();
			if(natal.equals(hoje))
			{
				System.out.print("Data de hoje: ");
				System.out.println(natal);
				break;
			}
			System.out.println(natal);
		}
	}

	public static Data ultimoNatal()
	{
		Data hoje = new Data();
		Data natal = new Data();
		
		if(hoje.dia() >= 25 && hoje.dia() <= 31 && hoje.mes() == 12)
		{
			natal = new Data(25, 12, hoje.ano());
		}
		else
		{
			natal = new Data(25, 12, hoje.ano() - 1);
		}
		return natal;
	}
}
