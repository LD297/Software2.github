package webstaffbl;

import java.rmi.RemoteException;

import constant.ResultMessage;
import constant.Role;
import promotionpo.WebSalesmanPO;
import webstaffblservice.WebStaffBLService;

public class WebStaffBLService_Stub implements WebStaffBLService{
	String id;
	String password;
	String name;
	String contact;
	
	public WebStaffBLService_Stub (String i, String p){
		id = i;
		password = p;
	}
	
	public Boolean checkPassword(Role r, String id, String p)throws RemoteException{
		if(password.equals(p))
			return true;
		else
			return false;
	}
	public ResultMessage addWebSalesman(String id, String password)throws RemoteException{
		if(id=="000000")
			return ResultMessage.success;
		else
			return ResultMessage.failure;
	}
	public ResultMessage updateWebSalesman(WebSalesmanPO po)throws RemoteException{
		if(id=="000000")
			return ResultMessage.success;
		else
			return ResultMessage.failure;
	}
	public ResultMessage delWebSalesman(String id)throws RemoteException{
		if(id=="000000")
			return ResultMessage.success;
		else
			return ResultMessage.failure;
	}
}
