package aula03.exercicio05;

public class Room 
{
	private Point p1;
	private Point p2;
	private String nome;

	public Room(Point p1, Point p2, String nome)
	{
		this.p1 = p1;
		this.p2 = p2;
		this.nome = nome;
	}
	
	public String roomType()
	{
		return nome;
	}
	
	public Point bottomLeft()
	{
		return p1;
	}
	
	public Point topRight()
	{
		return p2;
	}
	
	public Point geomCenter()
	{
		return p1.halfWayTo(p2);
	}
	
	public double area()
	{
		return (Math.abs(p1.x() - p2.x())) * (Math.abs(p1.y() - p2.y()));
	}
}
