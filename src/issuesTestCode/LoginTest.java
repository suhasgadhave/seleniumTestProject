package issuesTestCode;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebElement;

import comman.Comman;
import seleniumtesting.Config;
import seleniumtesting.Driver;
import seleniumtesting.User;

public class LoginTest {
	public static Map<String, Boolean> run(){
		Map<String, Boolean> loginTestResult = new HashMap<String, Boolean>();
		try {
			Driver.restartBrowser();
			adminLoginTest(loginTestResult);

			Driver.restartBrowser();
			salesUserLoginTest(loginTestResult);

			Driver.restartBrowser();
			salesManagerLoginTest(loginTestResult);

			Driver.restartBrowser();
			custOwnerLoginTest(loginTestResult);

			Driver.restartBrowser();
			custManagerLoginTest(loginTestResult);

			Driver.restartBrowser();
			custUserLoginTest(loginTestResult);
		} catch (InterruptedException e) {
		}
		return loginTestResult;
	}

	private static Map<String, Boolean> adminLoginTest(Map<String, Boolean> loginTestResult) throws InterruptedException {
		User.setEmail(Comman.Data.UserCredentail.ADMIN_EMAIL_WRONG);
		User.setPassword(Comman.Data.UserCredentail.ADMIN_PASS_CURRECT);
		loginTestResult.put("Admin able to login with Wrong eamil credentials", !isLoginSuccessful());

		User.setEmail(Comman.Data.UserCredentail.ADMIN_EMAIL_CURRECT);
		User.setPassword(Comman.Data.UserCredentail.ADMIN_PASS_WRONG);
		loginTestResult.put("Admin able to login with Wrong password credentials",!isLoginSuccessful());

		User.setEmail(Comman.Data.UserCredentail.ADMIN_EMAIL_CURRECT);
		User.setPassword(Comman.Data.UserCredentail.ADMIN_PASS_CURRECT);
		loginTestResult.put("Admin able to login with currect credentials", isLoginSuccessful());

		User.setEmail(Comman.Data.UserCredentail.ADMIN_EMAIL_WRONG);
		User.setPassword(Comman.Data.UserCredentail.ADMIN_PASS_WRONG);
		loginTestResult.put("Admin able to login with wrong credentials", !isLoginSuccessful());
		return loginTestResult;
	}

	private static Map<String, Boolean> salesManagerLoginTest(Map<String, Boolean> loginTestResult) throws InterruptedException {
		User.setEmail(Comman.Data.UserCredentail.SALES_MANAGER_EMAIL_WRONG);
		User.setPassword(Comman.Data.UserCredentail.SALES_MANAGER_PASS_CURRECT);
		loginTestResult.put("Sales Manager able to login with Wrong eamil credentials", !isLoginSuccessful());

		User.setEmail(Comman.Data.UserCredentail.SALES_MANAGER_EMAIL_CURRECT);
		User.setPassword(Comman.Data.UserCredentail.SALES_MANAGER_PASS_WRONG);
		loginTestResult.put("Sales Manager able to login with Wrong password credentials", !isLoginSuccessful());

		User.setEmail(Comman.Data.UserCredentail.SALES_MANAGER_EMAIL_CURRECT);
		User.setPassword(Comman.Data.UserCredentail.SALES_MANAGER_PASS_CURRECT);
		loginTestResult.put("Sales Manager able to login with currect credentials", isLoginSuccessful());

		User.setEmail(Comman.Data.UserCredentail.SALES_MANAGER_EMAIL_WRONG);
		User.setPassword(Comman.Data.UserCredentail.SALES_MANAGER_PASS_WRONG);
		loginTestResult.put("Sales Manager able to login with wrong credentials", !isLoginSuccessful());
		return loginTestResult;
	}

	private static Map<String, Boolean> salesUserLoginTest(Map<String, Boolean> loginTestResult) throws InterruptedException {
		User.setEmail(Comman.Data.UserCredentail.SALES_USER_EMAIL_WRONG);
		User.setPassword(Comman.Data.UserCredentail.SALES_USER_PASS_CURRECT);
		loginTestResult.put("Sales User able to login with Wrong eamil credentials", !isLoginSuccessful());

		User.setEmail(Comman.Data.UserCredentail.SALES_USER_EMAIL_CURRECT);
		User.setPassword(Comman.Data.UserCredentail.SALES_USER_PASS_WRONG);
		loginTestResult.put("Sales User able to login with Wrong password credentials", !isLoginSuccessful());

		User.setEmail(Comman.Data.UserCredentail.SALES_USER_EMAIL_CURRECT);
		User.setPassword(Comman.Data.UserCredentail.SALES_USER_PASS_CURRECT);
		loginTestResult.put("Sales User able to login with currect credentials", isLoginSuccessful());

		User.setEmail(Comman.Data.UserCredentail.SALES_USER_EMAIL_WRONG);
		User.setPassword(Comman.Data.UserCredentail.SALES_USER_PASS_WRONG);
		loginTestResult.put("Sales User able to login with wrong credentials", !isLoginSuccessful());
		return loginTestResult;
	}

	private static Map<String, Boolean> custOwnerLoginTest(Map<String, Boolean> loginTestResult) throws InterruptedException {
		User.setEmail(Comman.Data.UserCredentail.CUST_OWNER_EMAIL_WRONG);
		User.setPassword(Comman.Data.UserCredentail.CUST_OWNER_PASS_CURRECT);
		loginTestResult.put("Customer owner able to login with Wrong eamil credentials", !isLoginSuccessful());

		User.setEmail(Comman.Data.UserCredentail.CUST_OWNER_EMAIL_CURRECT);
		User.setPassword(Comman.Data.UserCredentail.CUST_OWNER_PASS_WRONG);
		loginTestResult.put("Customer owner able to login with Wrong password credentials", !isLoginSuccessful());

		User.setEmail(Comman.Data.UserCredentail.CUST_OWNER_EMAIL_CURRECT);
		User.setPassword(Comman.Data.UserCredentail.CUST_OWNER_PASS_CURRECT);
		loginTestResult.put("Customer owner able to login with currect credentials", isLoginSuccessful());		
		User.setEmail(Comman.Data.UserCredentail.CUST_OWNER_EMAIL_WRONG);
		User.setPassword(Comman.Data.UserCredentail.CUST_OWNER_PASS_WRONG);
		loginTestResult.put("Customer owner able to login with wrong credentials", !isLoginSuccessful());
		return loginTestResult;
	}

	private static Map<String, Boolean> custManagerLoginTest(Map<String, Boolean> loginTestResult) throws InterruptedException {
		User.setEmail(Comman.Data.UserCredentail.CUST_MANAGER_EMAIL_WRONG);
		User.setPassword(Comman.Data.UserCredentail.CUST_MANAGER_PASS_CURRECT);
		loginTestResult.put("Customer manager able to login with Wrong eamil credentials", !isLoginSuccessful());

		User.setEmail(Comman.Data.UserCredentail.CUST_MANAGER_EMAIL_CURRECT);
		User.setPassword(Comman.Data.UserCredentail.CUST_MANAGER_PASS_WRONG);
		loginTestResult.put("Customer manager able to login with Wrong password credentials", !isLoginSuccessful());

		User.setEmail(Comman.Data.UserCredentail.CUST_MANAGER_EMAIL_CURRECT);
		User.setPassword(Comman.Data.UserCredentail.CUST_MANAGER_PASS_CURRECT);
		loginTestResult.put("Customer manager able to login with currect credentials", isLoginSuccessful());

		User.setEmail(Comman.Data.UserCredentail.CUST_MANAGER_EMAIL_WRONG);
		User.setPassword(Comman.Data.UserCredentail.CUST_MANAGER_PASS_WRONG);
		loginTestResult.put("Customer manager able to login with wrong credentials", !isLoginSuccessful());
		return loginTestResult;
	}

	private static Map<String, Boolean> custUserLoginTest(Map<String, Boolean> loginTestResult) throws InterruptedException {
		User.setEmail(Comman.Data.UserCredentail.CUST_USER_EMAIL_WRONG);
		User.setPassword(Comman.Data.UserCredentail.CUST_USER_PASS_CURRECT);
		loginTestResult.put("Customer user able to login with Wrong eamil credentials", !isLoginSuccessful());

		User.setEmail(Comman.Data.UserCredentail.CUST_USER_EMAIL_CURRECT);
		User.setPassword(Comman.Data.UserCredentail.CUST_USER_PASS_WRONG);
		loginTestResult.put("Customer user able to login with Wrong password credentials", !isLoginSuccessful());

		User.setEmail(Comman.Data.UserCredentail.CUST_USER_EMAIL_CURRECT);
		User.setPassword(Comman.Data.UserCredentail.CUST_USER_PASS_CURRECT);
		loginTestResult.put("Customer user able to login with currect credentials", isLoginSuccessful());

		User.setEmail(Comman.Data.UserCredentail.CUST_USER_EMAIL_WRONG);
		User.setPassword(Comman.Data.UserCredentail.CUST_USER_PASS_WRONG);
		loginTestResult.put("Customer user able to login with wrong credentials", !isLoginSuccessful());
		return loginTestResult;
	}

	public static boolean isLoginSuccessful() {
		try {
			Config.goToLoginPage();
			String loginScreenTitle = Driver.getDriver().getTitle();
			WebElement email = Driver.getElementByXpath("//*[@placeholder='email']");
			email.sendKeys(User.getEmail());
			WebElement pass = Driver.getElementByXpath("//*[@placeholder='password']");
			pass.sendKeys(User.getPassword());
			Driver.getByLinkText("Login").click();
			Thread.sleep(2000);
			String afterLoginScreenTitle = Driver.getDriver().getTitle();
			if (!loginScreenTitle.equals(afterLoginScreenTitle)){
				return true;
			} 
		} catch (Exception e) {
			return false;
		}
		return false; 
	}
}
