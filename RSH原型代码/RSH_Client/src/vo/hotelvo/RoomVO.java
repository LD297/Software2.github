package hotelvo;

import java.util.ArrayList;
import java.util.Date;

public class RoomVO {
	public String id;//�Ƶ��id
	public Date date;
//	public String type;
//	public int amountAvailable;
	public int amountTotal;
	public double price;
	public String basicOrSpecial;
	public RoomVO(String id,String type,int amountTotal,double price,String basicOrSpecial) {
		this.id = id;
		this.date = date;
//		this.type = type;
//		this.amountAvailable = amountAvailable;
		this.amountTotal = amountTotal;
		this.price = price;
		this.basicOrSpecial = basicOrSpecial;
	}
}
