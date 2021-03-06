package driver;

import java.util.Date;

import constant.SortBy;
import constant.SortMethod;
import hotelblservice.SearchHotelBLService;
import hotelvo.SelectConditionVO;


public class SearchHotelBLService_Driver {
	public void drive(SearchHotelBLService searchHotelBLService) {
		searchHotelBLService.getHotelList("���ִ��", "��������Ȧ");
		searchHotelBLService.sort(SortBy.level, SortMethod.ascend);
		Date begin = new Date(1397165);
		Date end = new Date(64728652);
		SelectConditionVO vo = new SelectConditionVO("ɣ��", "���˼�", 100, 300, 2,
				begin, end, 5, 95, 100, "0928475", true);
		searchHotelBLService.select(vo);
		searchHotelBLService.getOrderStateOfUser("01774065", "927328692");
	}
}
