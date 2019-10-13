package aula04;

import java.util.Calendar;

public class Data 
{
	private int dia, mes, ano;

	/** Inicia esta data com o dia de hoje. */
	public Data() {
	    // Aqui usamos a classe Calendar da biblioteca standard para obter a data atual.
	    Calendar today = Calendar.getInstance();
	    dia = today.get(Calendar.DAY_OF_MONTH);
	    mes = today.get(Calendar.MONTH) + 1;
	    ano = today.get(Calendar.YEAR);
	}

  /** Inicia a data a partir do dia, mes e ano dados. */
	public Data(int dia, int mes, int ano) {
    	this.dia = dia;
    	this.mes = mes;
    	this.ano = ano;
	}
	
	public Data(String data)
	{
		String[] separate = data.split("-");
		int a = Integer.parseInt(separate[0]);
		int m = Integer.parseInt(separate[1]);
		int d = Integer.parseInt(separate[2]);
		assert(dataValida(d, m, a)) : "Data inválida";
		
			this.dia = d;
			this.mes = m;
			this.ano = a;
	}
	

  /** Devolve esta data segundo a norma ISO 8601. */
	public String toString() {
		return String.format("%4d-%02d-%02d", ano, mes, dia);
	}

  /** Indica se ano é bissexto. */
	public static boolean bissexto(int ano) {
		return (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;
	}

  /** Dimensões dos meses num ano comum. */
	private static final int[] diasMesComum = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private static final String[] nomeMes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", 
			"Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

  /** Devolve o número de dias do mês dado. */
	public static int diasDoMes(int mes, int ano) {
		assert(dataValida(5, mes, ano)): "Data invalida";
    	if(bissexto(ano))
    	{
    		diasMesComum[1] = 29;
    	}
    	else
    	{
    		diasMesComum[1] = 28;
    	}
		return diasMesComum[mes - 1];
	}

	public String mesExtenso() {
		return nomeMes[mes() - 1];
	}


	public String extenso() {
		return dia() + " de " + mesExtenso() + " de " + ano();
	}

	public static boolean dataValida(int dia, int mes, int ano) {
		if(ano < 0 || mes <= 0 || mes > 12 || dia <= 0 || dia > 31)
		{
			return false;
		}
		if(!bissexto(ano) && mes == 2 && dia == 29)
		{
			return false;
		}
		if(dia > diasMesComum[mes - 1])
		{
			return false;
		}
		return true;
	}


	public void seguinte() {
    	if(dia < diasDoMes(mes, ano))
    	{
    		dia++;
    	}
    	else if(mes < 12)
    	{
    		mes++;
    		dia = 1;
    	}
    	else
    	{
    		ano++;
    		dia = 1;
    		mes = 1;
    	}
	}
	
	public int dia()
	{
		return dia;
	}
	
	public int mes()
	{
		return mes;
	}
	
	public int ano()
	{
		return ano;
	}
	
	
	public boolean equals(Data d)
	{
		if(dia() == d.dia && mes() == d.mes && ano() == d.ano)
		{
			return true;
		}
		return false;
	}
	
	public int compare(Data d)
	{
		String s1 = "";
		String s2 = "";
		
		String ddia = Integer.toString(d.dia());
		String dmes = Integer.toString(d.mes());
		String tdia = Integer.toString(this.dia());
		String tmes = Integer.toString(this.mes());
		
		if(d.dia < 10)
		{
			ddia = "0" + d.dia;
		}
		
		if(d.mes < 10)
		{
			dmes = "0" + d.mes;
		}
		
		if(this.dia < 10)
		{
			tdia = "0" + this.dia;
		}
		
		if(this.mes < 10)
		{
			tmes = "0" + this.mes;
		}
		
		s1 = s1 + d.ano() + dmes + ddia;
		s2 = s2 + this.ano() + tmes + tdia;
		
		int data1 = Integer.parseInt(s1);
		int data2 = Integer.parseInt(s2);
		
		if(data1 > data2) return -1;
		else if(data1 < data2) return 1;
		else return 0;
	}
	
	public int compareTo(Data d)
	{
		if(this.dia() == d.dia() && this.mes() == d.mes() && this.ano() == d.ano())
		{
			return 0;
		}
		else if(this.ano() > d.ano())
		{
			return 1;
		}
		else if(this.ano() == d.ano() && this.mes() > d.mes())
		{
			return 1;
		}
		else if(this.mes() == d.mes() && this.ano() == d.ano() && this.dia() > d.dia())
		{
			return 1;
		}
		return -1;
	}
}

