package hotelbl;

import java.util.ArrayList;
import java.util.Date;

import constant.HotelOrderStateOfUser;
import constant.ResultMessage;
import constant.SortBy;
import constant.SortMethod;
import hotelblservice.SearchHotelBLService;
import hotelvo.HotelVO;
import hotelvo.SelectConditionVO;


public class SearchHotel implements SearchHotelBLService{

	@Override
	public ArrayList<HotelVO> getHotelList(String address, String businessArea) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<HotelVO> sort(SortBy sortBy, SortMethod sortM) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<HotelVO> select(SelectConditionVO sConditionVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HotelOrderStateOfUser getOrderStateOfUser(String userID, String hotelID) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public ResultMessage findID(String id){
		return null;
	}

}
