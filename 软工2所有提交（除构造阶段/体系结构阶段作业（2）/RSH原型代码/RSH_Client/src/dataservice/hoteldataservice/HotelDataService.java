package hoteldataservice;

import java.util.ArrayList;
import java.util.Date;

import constant.ResultMessage;
import hotelpo.HotelPO;
import hotelpo.RoomAvailablePO;

public interface HotelDataService {
	public HotelPO getHotel(String id);
	public ArrayList<HotelPO> getHotelList();
	public ResultMessage updateHotel(HotelPO po);
	public ResultMessage insertHotel(HotelPO po);
	public ResultMessage deleteHotel(HotelPO po);
	public ArrayList<RoomAvailablePO> getAvailableRoomList(String id);
	public ResultMessage updateAvailableRoomList(ArrayList<RoomAvailablePO> availableRoomList);
	public ResultMessage insertAvailableRoomList(ArrayList<RoomAvailablePO> availableRoomList);
	public ResultMessage insertAvailableRoom(RoomAvailablePO po);
	public ResultMessage deleteAvailableRoomList(ArrayList<RoomAvailablePO> availableRoomList);
	public int getHotelNum(String address);
	public int numOfAvailRoom(String id,String RoomType, Date checkIn, Date checkOut);
	public ResultMessage changeAvailRoom(String id,String RoomType, int num,Date checkIn, Date checkOut);
	public ResultMessage deleteAvailableRoom(RoomAvailablePO po);
	public ResultMessage updateGrade(String id,double grade);
	public ResultMessage findID(String id);
	public ArrayList<HotelPO> getHotelList(String address,String businessArea);
}
