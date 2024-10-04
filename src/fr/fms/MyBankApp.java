package fr.fms;

import java.util.Date;
import fr.fms.business.Ibanklmpl;
import fr.fms.business.Ibank;
import fr.fms.entities.CurrentAccount;
import fr.fms.entities.SavingAccount;
import fr.fms.entities.User;


public class MyBankApp {
	
	public static void main(String[] args) {
			
			Ibanklmpl bankJob = new Ibanklmpl();
			
			User robert = new User(1, "dupont", "robert", "robert@yahoo.fr");
			User julie = new User(2, "julie", "jolie", "julie@yahoo.fr");
			User papin = new User(3, "jean-pierre", "papin", "rachid@yahoo.fr");
			User zidane = new User(3, "zidane", "zinedine", "zidane@yahoo.fr");
			
			CurrentAccount firstAccount = new CurrentAccount(200300, new Date(), 6000, 700,robert );
			SavingAccount secondAccount = new SavingAccount(100200, new Date(), 1500, 200,julie );
			CurrentAccount thirdAccount = new CurrentAccount(150200, new Date(), 1800, 700,papin );
			CurrentAccount fourAccount = new CurrentAccount(200150, new Date(), 1700, 700,zidane );
			//System.out.println(firstAccount);
			//System.out.println(SecondAccount);
			bankJob.addAccount(firstAccount);
			bankJob.addAccount(secondAccount);
			bankJob.addAccount(thirdAccount);
			bankJob.addAccount(fourAccount);
			
//			System.out.println(bankJob.consultAccount(firstAccount.getIdAccount()));
//			System.out.println("*************");
//			System.out.println(bankJob.consultAccount(secondAccount.getIdAccount()));
//			System.out.println("*************");
//			System.out.println(bankJob.consultAccount(thirdAccount.getIdAccount()));
//			System.out.println("*************");
//			System.out.println(bankJob.consultAccount(fourAccount.getIdAccount()));
			
//			bankJob.withdraw(11111111, 1600);
//			System.out.println(bankJob.consultAccount(secondAccount.getIdAccount()));
//			boolean testRetrait = bankJob.withdraw(firstAccount.getIdAccount(),1400);
//			System.out.println(testRetrait);
//			System.out.println(bankJob.consultAccount(firstAccount.getIdAccount()).toString());
//			boolean testRetrait2 = bankJob.withdraw(firstAccount.getIdAccount(),1400);
//			System.out.println(testRetrait2);
//			System.out.println(bankJob.consultAccount(thirdAccount.getIdAccount()).toString());
//			bankJob.pay(thirdAccount.getIdAccount(), 1400);
//			System.out.println(bankJob.consultAccount(thirdAccount.getIdAccount()).toString());
//			boolean ok =bankJob.withdraw(thirdAccount.getIdAccount(), 3800);
			
//			System.out.println(bankJob.consultAccount(thirdAccount.getIdAccount()).toString());
			
			System.out.println(bankJob.consultAccount(secondAccount.getIdAccount()));
			System.out.println(bankJob.consultAccount(firstAccount.getIdAccount()));
			System.out.println("*************");
			bankJob.transfert( secondAccount.getIdAccount(),firstAccount.getIdAccount(), 300);
			System.out.println("*************");
			System.out.println(bankJob.consultAccount(secondAccount.getIdAccount()));
			System.out.println(bankJob.consultAccount(firstAccount.getIdAccount()));
	}
}
