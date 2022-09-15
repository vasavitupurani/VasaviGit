package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment5 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver chrdr = new ChromeDriver();
		chrdr.get("https://www.justrechargeit.com/");
		chrdr.manage().window().maximize();
		Thread.sleep(1000);
		chrdr.findElement(By.id("jriTop_signin9")).click();
		Thread.sleep(1000);
		
		chrdr.findElement(By.id("txtUserName")).sendKeys("hiall@gmail.com");
		chrdr.findElement(By.id("txtPasswd")).sendKeys("ajhd123");
		chrdr.findElement(By.name("txtCaptcha")).sendKeys("123");
		Thread.sleep(1000);
		chrdr.navigate().refresh();
		
		chrdr.findElement(By.id("txtUserName")).sendKeys("hiall@gmail.com");
		chrdr.findElement(By.id("txtPasswd")).sendKeys("ajhd123");
		chrdr.findElement(By.name("txtCaptcha")).sendKeys("147");
		Thread.sleep(1000);
		chrdr.findElement(By.name("imgbtnSignin")).click();
		
		chrdr.navigate().refresh();
		Thread.sleep(1000);
		chrdr.navigate().back();
		Thread.sleep(1000);
		chrdr.navigate().forward();
		Thread.sleep(1000);
		//chrdr.close();
		chrdr.quit();
	}

}
