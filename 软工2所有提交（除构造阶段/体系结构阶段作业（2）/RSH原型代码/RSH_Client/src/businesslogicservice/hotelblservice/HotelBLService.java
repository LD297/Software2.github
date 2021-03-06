package hotelblservice;

import java.util.ArrayList;
import java.util.Date;

import constant.ResultMessage;
import hotelvo.HotelVO;
import hotelvo.RoomAvailableVO;
import hotelvo.RoomVO;

public interface HotelBLService {
	public HotelVO getHotel ();
	public ResultMessage updateHotel (HotelVO vo);
	public ArrayList<RoomVO> getRoomList();
	public ResultMessage updateRoomList(ArrayList<RoomVO> roomList);
	public ResultMessage addSpecialRoom(RoomVO vo);
	public ResultMessage deleteSpecialRoom(RoomVO vo);
	public ArrayList<RoomAvailableVO> getAvailableRoomList(Date date);
	public ResultMessage updateAvailableRoomList(ArrayList<RoomAvailableVO> availableRoomList);
}
