package driver;

import java.rmi.RemoteException;

import constant.Role;
import logindata.LoginDataService_Stub;
import logindataservice.LoginDataService;
import loginpo.LoginRecordItemPO;

public class LoginDataService_Driver {
	
	public void drive(LoginDataService loginDataService) throws RemoteException{
		
		loginDataService.init();
		
		loginDataService.add(new LoginRecordItemPO(Role.user, "007", "2020-01-01"));
		
		loginDataService.detele(new LoginRecordItemPO(Role.user, "007", "2020-01-01"));
		
		loginDataService.update(new LoginRecordItemPO(Role.user, "007", "2020-01-01"));
		
		LoginRecordItemPO checkResult = loginDataService.check("007");
		if(checkResult.getId().equals("007")){
			System.out.println("Done!");
		} else {
			System.out.println("Error.Please try again.");
		}

		if(loginDataService.checkOnline("007")){
			System.out.println("Has been already online.");
		} else {
			System.out.println("Not online.");
		}
	
		loginDataService.finish();
			
	}

}
