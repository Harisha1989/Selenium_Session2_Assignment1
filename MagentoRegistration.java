package seleniumpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MagentoRegistration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://magento.com");
		WebDriverWait wait=new WebDriverWait(driver, 60);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement AccEle=driver.findElement(By.xpath("//span[text()='Account']/ancestor::a"));
		AccEle.click();
		WebElement RegEle=driver.findElement(By.xpath("//span[text()='Register']/ancestor::button"));
		RegEle.click();
		WebElement frstnameEle=driver.findElement(By.xpath("//input[@id='firstname']"));
		frstnameEle.sendKeys("Harisha");
		WebElement lastnameEle=driver.findElement(By.xpath("//input[@id='lastname']"));
		lastnameEle.sendKeys("Doniparthi");
		WebElement emailEle=driver.findElement(By.xpath("//input[@id='email_address']"));
		emailEle.sendKeys("harisha.doniparthi@gmail.com");
		WebElement pwdEle=driver.findElement(By.xpath("//input[@id='password']"));
		pwdEle.sendKeys("Welcome123");
		WebElement confEle=driver.findElement(By.xpath("//input[@id='confirmation']"));
		confEle.sendKeys("Welcome123");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='First Name']")));
		//driver.quit();
	
	}

}
