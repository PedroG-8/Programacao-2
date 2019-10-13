package aula03.exercicio05;
import java.util.ArrayList;

public class House 
{
	private int numDivAdicionais;
	private Room[] rooms;
	int count = 0;
	
	public House(String tipo)
	{
		rooms = new Room[7];
	}
	
	public House(String tipo, int numDivisoes, int numDivAdicionais)
	{
		this.numDivAdicionais = numDivAdicionais;
		rooms = new Room[numDivisoes];
	}
	
	public void addRoom(Room r)
	{
		rooms[count] = r;
		count++;
	}
	
	public int size()
	{
		return count;
	}
	
	public int maxSize()
	{
		return rooms.length;
	}
	
	public double area()
	{
		double totArea = 0;
		for(Room r : rooms)
		{
			totArea = totArea + r.area();
		}
		return totArea;
	}
	
	public Room room(int i)
	{
		return rooms[i];
	}
	
	public ArrayList<RoomTypeCount> getRoomTypeCounts()
	{
		boolean added = false;
		ArrayList<RoomTypeCount> roomTC = new ArrayList<RoomTypeCount>();
		for(Room r : rooms)
		{
			RoomTypeCount rtc = new RoomTypeCount();
			rtc.roomType = r.roomType();
			rtc.count = 1;
			for(RoomTypeCount roomTypeC : roomTC)
			{
				if(roomTypeC.roomType.equals(rtc.roomType))
				{
					rtc.count++;
				}
				else
				{
					added = true;
				}
			}
			if(added)
			{
				roomTC.add(rtc);
			}
		}
		return roomTC;
	}
	
	public double averageRoomDistance()
	{
		
	}
}
