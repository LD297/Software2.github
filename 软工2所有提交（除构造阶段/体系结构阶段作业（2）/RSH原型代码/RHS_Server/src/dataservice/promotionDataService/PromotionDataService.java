package promotionDataService;

import java.rmi.RemoteException;

import promotionpo.PromotionPO;

public interface PromotionDataService {
	
	public PromotionPO check(String id)throws RemoteException;
	
	public void add(PromotionPO po) throws RemoteException;
	
	public void update(PromotionPO po) throws RemoteException;
	
	public void del(PromotionPO po) throws RemoteException;
	
	public void init()throws RemoteException;
	
	public void finish()throws RemoteException;
}
