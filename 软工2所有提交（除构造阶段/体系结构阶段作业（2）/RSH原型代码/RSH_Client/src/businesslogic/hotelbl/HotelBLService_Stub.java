package hotelbl;

import java.util.ArrayList;
import java.util.Date;

import constant.ResultMessage;
import hotelblservice.HotelBLService;
import hotelvo.HotelVO;
import hotelvo.RoomAvailableVO;
import hotelvo.RoomVO;


public class HotelBLService_Stub implements HotelBLService{
	 public String id;
	 public String password;
	 public int phoneNumber;
	 public String name;
	 public String addr;
	 public String businessArea;
	 public String briefIntro;
	 public String facility;
	 public int level;
	 public int grade;
	 public int latestCheckinTime;
	 
//	 public Date date;
	 public String type;
	 public int amountAvailable;
	 public int amountTotal;
	 public double price;
	 public String basicOrSpecial;
	 public HotelBLService_Stub(String id,String password,int phoneNumber,String name,String addr,String businessArea,String briefIntro,String facility,int level,int grade,int latestCheckinTime,
			 String type,int amountTotal,double price,String basicOrSpecial, int amountAvailable) {
		 this.id = id;
		 this.addr = addr;
		 this.briefIntro = briefIntro;
		 this.businessArea = businessArea;
		 this.password = password;
		 this.phoneNumber = phoneNumber;
		 this.grade = grade;
		 this.businessArea = businessArea;
		 this.facility = facility;
		 this.level = level;
		 this.latestCheckinTime = latestCheckinTime;
		 
//		 this.date = date;
		 this.type = type;
		 this.amountAvailable = amountAvailable;
		 this.amountTotal = amountTotal;
		 this.price = price;
		 this.basicOrSpecial = basicOrSpecial;		 
	}
	@Override
	public HotelVO getHotel() {
		return new HotelVO(id, password, phoneNumber, name, addr, businessArea, briefIntro, facility, level, grade, latestCheckinTime);
	}

	@Override
	public ResultMessage updateHotel(HotelVO vo) {
		return ResultMessage.success;
	}

	@Override
	public ArrayList<RoomVO> getRoomList() {
		RoomVO vo = new RoomVO(id, type, amountTotal, price, basicOrSpecial);
		ArrayList<RoomVO> al = new ArrayList<>();
		al.add(vo);
		return al;
	}

	@Override
	public ResultMessage updateRoomList(ArrayList<RoomVO> roomList) {
		return ResultMessage.success;
	}

	@Override
	public ResultMessage addSpecialRoom(RoomVO vo) {
		return ResultMessage.success;
	}

	@Override
	public ResultMessage deleteSpecialRoom(RoomVO vo) {
		return ResultMessage.success;
	}

	@Override
	public ArrayList<RoomAvailableVO> getAvailableRoomList(Date date) {
		RoomAvailableVO vo = new RoomAvailableVO(id, date, type, amountAvailable, amountTotal, price, basicOrSpecial);
		ArrayList<RoomAvailableVO> al = new ArrayList<>();
		al.add(vo);
		return al;
	}

	@Override
	public ResultMessage updateAvailableRoomList(ArrayList<RoomAvailableVO> availableRoomList) {
		return ResultMessage.success;
	}

}
