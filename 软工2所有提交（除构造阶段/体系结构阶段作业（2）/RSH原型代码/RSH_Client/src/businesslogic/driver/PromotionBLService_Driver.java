package driver;

import java.rmi.RemoteException;
import java.util.ArrayList;

import constant.ResultMessage;
import constant.Role;
import constant.condition;
import promotionblservice.PromotionBLService;
import promotionpo.PromotionPO;
import promotionpo.WebSalesmanPO;
import webstaffblservice.WebStaffBLService;

public class PromotionBLService_Driver {
    public void drivepro(PromotionBLService promotionBLService) throws RemoteException{
    	ArrayList<PromotionPO> re = promotionBLService.show("000000");
        if (re==null) System.out.println("Add Success!");
        
        ResultMessage result = promotionBLService.add("000000",1,"promo1",condition.Date,100);
        if (result==ResultMessage.success) System.out.println("Add Success!");
        result = promotionBLService.update("000000",1,"promo1",condition.Date,100);
        if (result==ResultMessage.success) System.out.println("Update Success!");
        result = promotionBLService.del("000000",1);
        if (result==ResultMessage.success) System.out.println("Delete Success!");
        
        int total = promotionBLService.totalDiscount("000000", "2016-01-01",true,true,3,100);
        if(total==0)  System.out.println("hotel Success!");
        total = promotionBLService.totalDiscount("000000","a", "2016-01-01");
        if(total==0)  System.out.println("web Success!");
        total = promotionBLService.roomDiscount("000000","a", "2016-01-01");
        if(total==0)  System.out.println("room Success!");
        
        String name = promotionBLService.getName("000000", "2016-01-01", true, true, 3, 100);
        if(name.equals("name")) System.out.println("hotel name Success!");
        name = promotionBLService.getName("2016-01-01", "000000", 4);
        if(name.equals("name")) System.out.println("web name Success!");
    
    }
    
}
