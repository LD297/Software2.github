package hotelbl;

import java.util.ArrayList;
import java.util.Date;

import constant.ResultMessage;
import hotelblservice.HotelBLService;
import hotelvo.HotelVO;
import hotelvo.RoomAvailableVO;
import hotelvo.RoomVO;

public class Hotel implements HotelBLService{
	
	public String id;
	
	public Hotel(String id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}
	
	@Override
	public HotelVO getHotel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage updateHotel(HotelVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<RoomVO> getRoomList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage updateRoomList(ArrayList<RoomVO> roomList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage addSpecialRoom(RoomVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage deleteSpecialRoom(RoomVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<RoomAvailableVO> getAvailableRoomList(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage updateAvailableRoomList(ArrayList<RoomAvailableVO> availableRoomList) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public ArrayList<String> getRoomType(){
		return null;
	}
	
	public ResultMessage checkPassword(String password){
		return null;
	}
	
	public ResultMessage updateGrade(double grade){
		return null;
	}
	
	public int numOfAvailRoom(String roomType, Date checkIn, Date checkOut){
		return 0;
	}
	
	public ResultMessage changeAvailRoom(String roomType, int num,Date checkIn, Date checkOut){
		return null;
	}

}
