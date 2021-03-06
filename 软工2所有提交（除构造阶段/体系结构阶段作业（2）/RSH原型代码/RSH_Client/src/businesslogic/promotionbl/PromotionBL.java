package promotionbl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import constant.ResultMessage;
import constant.condition;
import promotionblservice.PromotionBLService;
import promotionpo.PromotionPO;



public class PromotionBL implements PromotionBLService{
    
	String hotelid;
	int number;
	String name;
	condition con;
	int ratio;
	
	
	public PromotionBL(String id,int num,String n,condition c,int r){
	
		hotelid = id;
		number = num;
		name = n;
		con = c;
		ratio = r;
    }
    

	@Override
	public ArrayList<PromotionPO> show(String id)throws RemoteException{
		return null;
	}
	@Override
	public ResultMessage add(String id, int number, String name, condition con, int ratio)throws RemoteException{
		return ResultMessage.success;
	}
	@Override
	public ResultMessage update(String id, int number, String name, condition con, int ratio)throws RemoteException{
		return ResultMessage.success;
	}
	@Override
	public ResultMessage del(String id, int number)throws RemoteException{
		return ResultMessage.success;
	}
	@Override
	public int totalDiscount(String hotelid, String date, Boolean IsBirthday, Boolean IsEnterprise, int roomNumber, int consumption)throws RemoteException{
		return 100;
	}
	@Override
	public int totalDiscount(String id, String type, String date)throws RemoteException{
		return 100;
	}
	@Override
	public int roomDiscount(String id, String type, String date)throws RemoteException{
		return 100;
	}
	@Override
	public String getName(String id, String date,Boolean IsBirthday, Boolean IsEnterprise, int roomNumber, int consumption)throws RemoteException{
		return null;
	}
	@Override
	public String getName(String date, String id, int memberLevel)throws RemoteException{
		return null;
	}
	
}
