package testscenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gitpush {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://echallan.tspolice.gov.in/publicview/");  
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"REG_NO\"]")).sendKeys("ABDCF123S");
		driver.findElement(By.id("captchatab1")).sendKeys("1234");
		//driver.findElement(By.xpath("//*[@id=\"captchatab1\"]")).sendKeys("12");
		//driver.findElement(By.id("tab1btn")).click();
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",
				driver.findElement(By.id("tab1btn")));
	}

}
