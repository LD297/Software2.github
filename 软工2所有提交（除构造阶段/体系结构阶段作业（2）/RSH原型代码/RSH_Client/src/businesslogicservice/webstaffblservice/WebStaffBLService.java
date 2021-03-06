package webstaffblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import constant.ResultMessage;
import constant.Role;
import promotionpo.WebSalesmanPO;

public interface WebStaffBLService extends Remote{
	public Boolean checkPassword(Role r, String id, String p)throws RemoteException;
	public ResultMessage addWebSalesman(String id, String password)throws RemoteException;
	public ResultMessage updateWebSalesman(WebSalesmanPO po)throws RemoteException;
	public ResultMessage delWebSalesman(String id)throws RemoteException;
}
