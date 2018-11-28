package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriverConfig {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.ie.driver","./Drivers/IEDriverServer.exe");
		WebDriver IEDriver = new InternetExplorerDriver();//this opens the IE using the IEDriver
		System.out.println("Welcome to Internet Explorer");		

	}

}
