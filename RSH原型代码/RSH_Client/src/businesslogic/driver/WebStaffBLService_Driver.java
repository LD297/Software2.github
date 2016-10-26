package driver;

import java.rmi.RemoteException;

import constant.ResultMessage;
import constant.Role;
import promotionpo.WebSalesmanPO;
import webstaffblservice.WebStaffBLService;

public class WebStaffBLService_Driver {
	
	   public void driveweb(WebStaffBLService webstaffBLservice)throws RemoteException{
	    	if(true==webstaffBLservice.checkPassword(Role.user, "000000", "abcdef")) 
	    		System.out.println("check success!");
	    	ResultMessage result = webstaffBLservice.addWebSalesman("000000", "abcdef");
	    	if(result==ResultMessage.success) System.out.println("add success!");
	    	result = webstaffBLservice.updateWebSalesman(new WebSalesmanPO("000000","abcdef"));
	    	if(result==ResultMessage.success) System.out.println("update success!");
	    	result = webstaffBLservice.delWebSalesman("000000");
	    	if(result==ResultMessage.success) System.out.println("delete success!");
	    	    	
	    }
}
