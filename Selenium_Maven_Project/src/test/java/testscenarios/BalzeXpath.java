package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BalzeXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://blazedemo.com/");
		new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("Boston");
		new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("Rome");
				driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
				driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();
				
	}

}
