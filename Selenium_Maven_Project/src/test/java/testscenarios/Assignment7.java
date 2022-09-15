package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment7 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://myaccount.greenmountain.com/en_US/register");
		driver.findElement(By.linkText("Contact Us")).click();
		//Thread.sleep(2000);
		//ass7.manage().window().minimize();
		Thread.sleep(5000);
		driver.close();
		Thread.sleep(5000);
		driver.quit();
	}

}
