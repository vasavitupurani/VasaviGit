package testscenarios;

import java.time.Duration;

import org.apache.commons.lang3.time.DurationUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Invalidbuttontest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://us.megabus.com/account-management/login");
		driver.findElement(By.linkText("Sign up")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("confirmEmail")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("choosePassword")).sendKeys("abc@123");
		driver.findElement(By.id("confirmPassword")).sendKeys("abc@123");
		driver.findElement(By.id("termsAndPrivacy")).click();
		driver.findElement(By.id("marketing")).click();
		
		  if (driver.findElement(By.xpath("//button[@id='signup']")).isEnabled()) {
			System.out.println("The signup button is enabled state");
		  }else {
		  System.out.println("signup button is disabled state");
	     }
		}

		}
		
	

