package promotionbl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import constant.ResultMessage;
import constant.condition;
import promotionblservice.PromotionBLService;
import promotionpo.PromotionPO;

public class PromotionBLService_Stub implements PromotionBLService{
	String hotelid;
	int number;
	String name;
	condition con;
	int ratio;
	
	
	public PromotionBLService_Stub(String id,int num,String n,condition c,int r){
	
		hotelid = id;
		number = num;
		name = n;
		con = c;
		ratio = r;
    }
    public ArrayList<PromotionPO> show(String id)throws RemoteException{
    	return null;
    }
	
	public ResultMessage add(String id, int number, String name, condition con, int ratio)throws RemoteException{
		if(id=="000000")
			return ResultMessage.success;
		else
			return ResultMessage.failure;
	}
	
	public ResultMessage update(String id, int number, String name, condition con, int ratio)throws RemoteException{
		if(id=="000000")
			return ResultMessage.success;
		else
			return ResultMessage.failure;
	}
	
	public ResultMessage del(String id, int number)throws RemoteException{
		if(id=="000000")
			return ResultMessage.success;
		else
			return ResultMessage.failure;
	}
	
	public int totalDiscount(String id, String date, Boolean IsBirthday, Boolean IsEnterprise, int roomNumber, int consumption)throws RemoteException{
		return 0;
	}
	
	public int totalDiscount(String id, String type, String date)throws RemoteException{
		return 0;
	}
	
	public int roomDiscount(String id, String type, String date)throws RemoteException{
		return 0;
	}
	
	public String getName(String id, String date,Boolean IsBirthday, Boolean IsEnterprise, int roomNumber, int consumption)throws RemoteException{
		return "name";
	}
	
	public String getName(String date, String id, int memberLevel)throws RemoteException{
		return "name";
	}

}
