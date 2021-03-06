package webstaffdataservice;

import java.rmi.RemoteException;

import promotionpo.WebSalesmanPO;



public interface WebStaffDataService {
	public WebSalesmanPO checkWebSalesman(String id) throws RemoteException;
	
	public void addWebSalesman(WebSalesmanPO po) throws RemoteException;
	
	public void updateWebSalesman(WebSalesmanPO po) throws RemoteException;
	
	public void delWebSalesman(WebSalesmanPO po) throws RemoteException;
	
	public void init()throws RemoteException;
		
	public void finish()throws RemoteException;
		
}
