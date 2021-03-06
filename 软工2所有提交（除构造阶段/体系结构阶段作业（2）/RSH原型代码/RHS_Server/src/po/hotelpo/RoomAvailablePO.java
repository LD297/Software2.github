package hotelpo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class RoomAvailablePO implements Serializable{
	public String id;//�Ƶ��id
	public Date date;
	public String type;
	public int amountAvailable;
	public int amountTotal;
	public double price;
	public String basicOrSpecial;
	public ArrayList<Integer> aList;
	public RoomAvailablePO(String id,Date date,String type,int amountAvailable,int amountTotal,double price,String basicOrSpecial,ArrayList<Integer> aList) {
		this.id = id;
		this.date = date;
		this.type = type;
		this.amountAvailable = amountAvailable;
		this.amountTotal = amountTotal;
		this.price = price;
		this.basicOrSpecial = basicOrSpecial;
		this.aList = aList;
	}
}