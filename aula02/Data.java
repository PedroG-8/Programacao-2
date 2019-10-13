package aula02;

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

  /** Devolve esta data segundo a norma ISO 8601. */
	public String toString() {
		return String.format("%04d-%02d-%02d", ano, mes, dia);
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
		if(bissexto(ano) && mes == 2 && dia == 29)
		{
			return true;
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
}

